package com.elelogi.portfolio.controller;

import com.elelogi.portfolio.model.Artist;
import com.elelogi.portfolio.service.ArtistService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/artist")
@CrossOrigin(origins = "http://localhost:3000")
public class ArtistController {

    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping
    public Artist getArtist() {
        return artistService.getArtist();
    }

    @PutMapping
    public Artist updateArtist(@RequestBody Artist artist) {
        return artistService.updateArtist(artist);
    }
}
