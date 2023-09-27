package com.example.projetSpring.service;

import com.example.projetSpring.dao.CocktailDAO;
import com.example.projetSpring.dao.NecessiterDAO;
import com.example.projetSpring.entity.Cocktail;
import com.example.projetSpring.entity.Ingredient;
import com.example.projetSpring.entity.Necessiter;
import com.example.projetSpring.entity.PKnecessiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NecessiterService {
    @Autowired
    private NecessiterDAO dao;
    public String addNecessiter(Necessiter necessiter){
        dao.save(necessiter);
        return "Nouvelle ligne necessiter ajouté à la base de donnée : " + necessiter.getPrimaryKey();
    }

    public String deleteNecessiter(Necessiter necessit){

        dao.delete(necessit);
        return "La ligne necessiter avec ingredient numéro "+necessit.getIngredient().getCodeing()+" et cocktail numéro : "+ necessit.getCocktail().getNumco() + "a été supprimé";

    }

    public Necessiter getNecessiterByPK(PKnecessiter pk){

        List<Necessiter> LesNecessiter = dao.findAll();
        for (Necessiter necessiter : LesNecessiter){
            if (necessiter.getPrimaryKey() == pk){
                return necessiter;
            }
        }
        return null;

    }


    public String updateNecessiter(Necessiter necessit){
        dao.save(necessit);
        return "Ligne necessiter modifiée code ing: " +
                necessit.getPrimaryKey().getUnIng() +
                "code cocktail : "+necessit.getPrimaryKey().getUnCock();
    }

    public List<Necessiter> getLesNecessiter(){
        List<Necessiter> lesNecessiter = dao.findAll();
        return lesNecessiter;
    }

    public List<Necessiter> getNecessiterByCocktail(Cocktail unCock){
        List<Necessiter> lesNec =  dao.findAllByPrimaryKeyCocktail(unCock);

        return lesNec;

    }
}
