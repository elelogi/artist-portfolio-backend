package com.elelogi.portfolio.service;

import com.elelogi.portfolio.model.ArtworkImage;
import com.elelogi.portfolio.repository.ArtworkImageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtworkImageService {

    private final ArtworkImageRepository artworkImageRepository;

    public ArtworkImageService(ArtworkImageRepository artworkImageRepository) {
        this.artworkImageRepository = artworkImageRepository;
    }

    public List<ArtworkImage> getAll() {
        return artworkImageRepository.findAll();
    }

    public ArtworkImage create(ArtworkImage image) {
        return artworkImageRepository.save(image);
    }

    public void delete(Long id) {
        artworkImageRepository.deleteById(id);
    }
}
