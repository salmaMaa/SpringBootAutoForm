package com.example.projetSpring.controller;

import com.example.projetSpring.entity.Categorie;
import com.example.projetSpring.entity.Cocktail;
import com.example.projetSpring.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategorieController {
    @Autowired
    private CategorieService serviceCategorie;

    @GetMapping("/getCategories")
    public List<Categorie> getCocktails(){
        return serviceCategorie.getLesCategories();
    }
}
