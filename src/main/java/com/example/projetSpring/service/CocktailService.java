package com.example.projetSpring.service;

import com.example.projetSpring.dao.CocktailDAO;
import com.example.projetSpring.entity.Cocktail;
import com.example.projetSpring.entity.Necessiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CocktailService {

    @Autowired
    private CocktailDAO dao;
    public String addCocktail(Cocktail cocktail){
        dao.save(cocktail);
        return "Nouveau cocktail ajouté à la base de donnée : " + cocktail.getNomco();
    }

    public String updateCocktail(Cocktail cocktail){
        dao.save(cocktail);
        return "Cocktail modifié: " + cocktail.getNomco();
    }

    public String deleteCocktail(int numCo){
        Cocktail cocktail = dao.findById(numCo).get();
        dao.delete(cocktail);
        return "Le cocktail numéro "+ numCo +" a été supprimé";

    }

    public Cocktail getCocktailById(int num){
        Cocktail cocktail = dao.findById( num).get();
        return cocktail;
    }

    public List<Cocktail> getLesCocktails(){
        List<Cocktail> lesCocktails = dao.findAll(Sort.by(Sort.Direction.ASC, "numco"));
        return lesCocktails;
    }

    public List<Necessiter> getNecessiterByCocktail(Cocktail unCock){


        return null;

    }
}
