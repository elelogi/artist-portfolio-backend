package com.elelogi.portfolio.service;

import com.elelogi.portfolio.model.Artwork;
import com.elelogi.portfolio.repository.ArtworkRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtworkService {

    private final ArtworkRepository artworkRepository;

    public ArtworkService(ArtworkRepository artworkRepository) {
        this.artworkRepository = artworkRepository;
    }

    public List<Artwork> getAllArtworks() {
        return artworkRepository.findAll();
    }

    public Artwork getArtwork(Long id) {
        Artwork artwork = artworkRepository.findDetailedById(id);
        if (artwork == null) {
            throw new RuntimeException("Artwork not found");
        }
        return artwork;
    }


    public Artwork createArtwork(Artwork artwork) {
        if (artwork.getImages() != null) {
            artwork.getImages().forEach(img -> img.setArtwork(artwork));
        }
        return artworkRepository.save(artwork);
    }

    public Artwork updateArtwork(Long id, Artwork updated) {
        Artwork existing = getArtwork(id);

        existing.setTitle(updated.getTitle());
        existing.setDescription(updated.getDescription());
        existing.setYear(updated.getYear());
        existing.setTechnique(updated.getTechnique());
        existing.setSize(updated.getSize());

        existing.setCategories(updated.getCategories());

        existing.getImages().clear();
        if (updated.getImages() != null) {
            updated.getImages().forEach(img -> img.setArtwork(existing));
            existing.getImages().addAll(updated.getImages());
        }

        return artworkRepository.save(existing);
    }

    public void deleteArtwork(Long id) {
        artworkRepository.deleteById(id);
    }
}
