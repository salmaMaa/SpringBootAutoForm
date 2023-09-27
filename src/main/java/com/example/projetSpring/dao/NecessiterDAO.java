package com.example.projetSpring.dao;


import com.example.projetSpring.entity.Cocktail;
import com.example.projetSpring.entity.Necessiter;
import com.example.projetSpring.entity.PKnecessiter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NecessiterDAO  extends JpaRepository<Necessiter, PKnecessiter>  {


    List<Necessiter> findAllByPrimaryKeyCocktail  (Cocktail cocktail);
}
