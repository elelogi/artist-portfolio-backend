package com.elelogi.portfolio.service;

import com.elelogi.portfolio.model.Artist;
import com.elelogi.portfolio.repository.ArtistRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ArtistService {

    private final ArtistRepository artistRepository;

    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public Artist getArtist() {
        return artistRepository.findById(1L)
                .orElseThrow(() -> new RuntimeException("Artist not found"));
    }

    public Artist updateArtist(Artist artist) {
        artist.setId(1L);
        return artistRepository.save(artist);
    }
}

