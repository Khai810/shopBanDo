package com.projectshopbando.shopbandoapi.repositories;

import com.projectshopbando.shopbandoapi.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {
}
