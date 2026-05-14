package com.elelogi.portfolio.repository;

import com.elelogi.portfolio.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
