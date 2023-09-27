package com.example.projetSpring.dao;

import com.example.projetSpring.entity.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface CategorieDAO extends JpaRepository<Categorie,Integer>{
}
