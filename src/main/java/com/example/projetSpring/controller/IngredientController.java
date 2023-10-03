package com.example.projetSpring.controller;

import com.example.projetSpring.entity.*;
import com.example.projetSpring.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IngredientController {

    @Autowired
    private IngredientService serviceIngredient;

    @GetMapping("/getIngredients")
    public List<Ingredient> getIngredients(){
        return serviceIngredient.getLesIngredients();
    }

    @PostMapping("/addIngredient")
    public String addIngredients(@RequestBody DTOIngredient dtoIngredient){

        int codeing = serviceIngredient.getLesIngredients().get(getIngredients().size()-1).getCodeing() + 1 ;

        Ingredient ingredient = new Ingredient(codeing,dtoIngredient.getNoming(),dtoIngredient.getUnitemesure());
        return serviceIngredient.addIngredient(ingredient);

    }

    @PutMapping("/updateIngredient")
    public String updateIngredients(@RequestBody DTOIngredient dtoIngredient){


        Ingredient ing = new Ingredient(dtoIngredient.getCodeing(),dtoIngredient.getNoming(),dtoIngredient.getUnitemesure());

        return serviceIngredient.updateIngredient(ing);

    }
    @DeleteMapping("/deleteIngredient/{codeing}")
    public String deleteIngredient(@PathVariable int codeing){
        return serviceIngredient.deleteIngredient(codeing);
    }


}
