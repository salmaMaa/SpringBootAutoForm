package com.example.projetSpring.controller;

import com.example.projetSpring.entity.*;
import com.example.projetSpring.service.CocktailService;
import com.example.projetSpring.service.IngredientService;
import com.example.projetSpring.service.NecessiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NecessiterController {

    @Autowired
    private NecessiterService serviceNecessiter;
    @Autowired
    private IngredientService serviceIngredient;
    @Autowired
    private CocktailService serviceCocktail;

    @PostMapping("/addNecessiter")
    public String addNecessiter(@RequestBody DTONecessiter DtoNecessiter){

        Ingredient monIng = serviceIngredient.getIngredientById(Integer.parseInt(DtoNecessiter.getCodeing()));
        Cocktail monCock = serviceCocktail.getCocktailById(Integer.parseInt(DtoNecessiter.getNumco()));
        PKnecessiter laPk = new PKnecessiter(monIng,monCock);
        Necessiter leNec = new Necessiter(laPk,DtoNecessiter.getQuantite());
        return serviceNecessiter.addNecessiter(leNec);
    }

    @GetMapping("/getNecessiter")
    public List<Necessiter> getNecessiter(){
        return serviceNecessiter.getLesNecessiter();
    }

    @PutMapping("/updateNecessiter")
    public String updateNecessiter(@RequestBody DTONecessiter DtoNecessiter){

        Ingredient monIng = serviceIngredient.getIngredientById(Integer.parseInt(DtoNecessiter.getCodeing()));
        Cocktail monCock = serviceCocktail.getCocktailById(Integer.parseInt(DtoNecessiter.getNumco()));
        PKnecessiter laPk = new PKnecessiter(monIng,monCock);
        Necessiter leNec = new Necessiter(laPk,DtoNecessiter.getQuantite());
        return serviceNecessiter.updateNecessiter(leNec);

    }

    @DeleteMapping("/deleteNecessiter/{numCo}/{codeIng}")
    public String deleteNecessiter(@PathVariable int numCo,@PathVariable int codeIng){

        Ingredient monIng = serviceIngredient.getIngredientById(codeIng);
        Cocktail monCock = serviceCocktail.getCocktailById(numCo);
        PKnecessiter laPk = new PKnecessiter(monIng,monCock);
        Necessiter leNec = serviceNecessiter.getNecessiterByPK(laPk);

        System.out.println(leNec.getQteutilisee());
        return serviceNecessiter.deleteNecessiter(leNec);
    }

    @GetMapping("/getNecessiterByCocktail/{numco}")
    public List<Necessiter> getNecessiterByCocktail(@PathVariable int numco){
        Cocktail leCo = serviceCocktail.getCocktailById(numco);

        return serviceNecessiter.getNecessiterByCocktail(leCo);
    }

}
