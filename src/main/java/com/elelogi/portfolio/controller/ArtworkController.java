package com.elelogi.portfolio.controller;

import com.elelogi.portfolio.model.Artwork;
import com.elelogi.portfolio.service.ArtworkService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/artworks")
@CrossOrigin(origins = "http://localhost:3000")
public class ArtworkController {

    private final ArtworkService artworkService;

    public ArtworkController(ArtworkService artworkService) {
        this.artworkService = artworkService;
    }

    @GetMapping
    public List<Artwork> getAll() {
        return artworkService.getAllArtworks();
    }

    @GetMapping("/{id}")
    public Artwork getById(@PathVariable Long id) {
        return artworkService.getArtwork(id);
    }

    @PostMapping
    public Artwork create(@RequestBody Artwork artwork) {
        return artworkService.createArtwork(artwork);
    }

    @PutMapping("/{id}")
    public Artwork update(@PathVariable Long id, @RequestBody Artwork artwork) {
        return artworkService.updateArtwork(id, artwork);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        artworkService.deleteArtwork(id);
    }
}
