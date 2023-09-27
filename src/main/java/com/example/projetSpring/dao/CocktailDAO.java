package com.example.projetSpring.dao;

import com.example.projetSpring.entity.Cocktail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CocktailDAO  extends JpaRepository<Cocktail,Integer> {


}
