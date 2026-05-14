package com.elelogi.portfolio.repository;

import com.elelogi.portfolio.model.Artwork;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtworkRepository extends JpaRepository<Artwork, Long> {

    @EntityGraph(attributePaths = {"categories", "images"})
    Artwork findDetailedById(Long id);
}
