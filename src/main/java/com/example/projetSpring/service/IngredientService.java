package com.example.projetSpring.service;


import com.example.projetSpring.dao.IngredientDAO;
import com.example.projetSpring.entity.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {

    @Autowired
    private IngredientDAO dao;
    public String addIngredient(Ingredient ingredient){
        dao.save(ingredient);
        return "Nouvel ingredient ajouté à la base de donnée : " + ingredient.getNoming();
    }

    public String deleteIngredient(int numIg){
        Ingredient ingredient = dao.findById(numIg).get();
        dao.delete(ingredient);
        return "L'ingredient numéro "+numIg+" a été supprimé";

    }

    public Ingredient getIngredientById(int num){
        Ingredient ingredient = dao.findById(num).get();
        return ingredient;
    }

    public List<Ingredient> getLesIngredients(){
        return dao.findAll();
    }
}
