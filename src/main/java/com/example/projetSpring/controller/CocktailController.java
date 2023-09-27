package com.example.projetSpring.controller;

import com.example.projetSpring.entity.Categorie;
import com.example.projetSpring.entity.Cocktail;
import com.example.projetSpring.entity.DTOCocktail;
import com.example.projetSpring.service.CategorieService;
import com.example.projetSpring.service.CocktailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class CocktailController {

    @Autowired
    private CocktailService serviceCocktail;

    @Autowired
    private CategorieService serviceCategorie;


    @PostMapping("/addCocktail")
    public String addCocktail(@RequestBody DTOCocktail dtoCocktail){

        Categorie maCat = serviceCategorie.getCategorieById(dtoCocktail.getNumcat());
        int numco = getCocktails().get(getCocktails().size()-1).getNumco() + 1 ;
        Cocktail cocktail = new Cocktail(numco,dtoCocktail.getNomco(),dtoCocktail.getDatecreationco(),dtoCocktail.getExplicationco(),dtoCocktail.getImage(),maCat);

        System.out.println(cocktail.getNumco());
        return serviceCocktail.addCocktail(cocktail);

    }


    @PutMapping("/updateCocktail")
    public String updateCocktail(@RequestBody DTOCocktail dtoCocktail){

        Categorie maCat = serviceCategorie.getCategorieById(dtoCocktail.getNumcat());
        Cocktail cocktail = new Cocktail(dtoCocktail.getNumco(),dtoCocktail.getNomco(),dtoCocktail.getDatecreationco(),dtoCocktail.getExplicationco(),dtoCocktail.getImage(),maCat);

        System.out.println(cocktail.getNumco());
        return serviceCocktail.updateCocktail(cocktail);

    }

    @DeleteMapping("/deleteCocktail/{numCo}")
    public String deleteCocktail(@PathVariable int numCo){
        return serviceCocktail.deleteCocktail(numCo);
    }

    @GetMapping("/getCocktails")
    public List<Cocktail> getCocktails(){
        return serviceCocktail.getLesCocktails();
    }

    @RequestMapping("/getCocktailById/{id}")
    public Cocktail getCocktailById(@PathVariable int id){
        return serviceCocktail.getCocktailById(id);
    }
}
