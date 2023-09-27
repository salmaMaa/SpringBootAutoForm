package com.example.projetSpring.service;

import com.example.projetSpring.dao.CategorieDAO;
import com.example.projetSpring.dao.CocktailDAO;
import com.example.projetSpring.entity.Categorie;
import com.example.projetSpring.entity.Cocktail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService {

    @Autowired
    private CategorieDAO dao;

    public String addCategorie(Categorie categorie){
        dao.save(categorie);
        return "Nouvelle catégorie ajoutée à la base de donnée : " + categorie.getCodecat();
    }

    public String deleteCategorie(int codeCat){
        Categorie categorie = dao.findById(codeCat).get();
        dao.delete(categorie);
        return "La catégorie de numéro " + codeCat + " a été supprimé";

    }

    public Categorie getCategorieById(int num){
        Categorie categorie = dao.findById(num).get();
        return categorie;
    }

    public List<Categorie> getLesCategories(){
        List<Categorie> lesCategories = dao.findAll();
        return lesCategories;
    }
}
