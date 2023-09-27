package com.example.projetSpring.dao;


import com.example.projetSpring.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientDAO extends JpaRepository<Ingredient,Integer> {
}
