package com.elelogi.portfolio.repository;

import com.elelogi.portfolio.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
