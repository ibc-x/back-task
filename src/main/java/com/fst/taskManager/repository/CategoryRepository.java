package com.fst.taskManager.repository;

import com.fst.taskManager.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // Ajoutez des méthodes de requête personnalisées si nécessaire
    Category findByName(String name);
}
