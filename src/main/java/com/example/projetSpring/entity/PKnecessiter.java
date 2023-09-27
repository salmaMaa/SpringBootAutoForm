package com.example.projetSpring.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PKnecessiter implements Serializable {

    @ManyToOne(cascade = CascadeType.ALL)
    private Ingredient ingredient;
    @ManyToOne(cascade = CascadeType.ALL)
    private Cocktail cocktail;


    // constructeurs


    public PKnecessiter() {
    }

    public PKnecessiter(Ingredient ingredient, Cocktail cocktail) {
        this.ingredient = ingredient;
        this.cocktail = cocktail;
    }

    //get et set



    public Ingredient getUnIng() {
        return ingredient;
    }

    public void setUnIng(Ingredient unIng) {
        this.ingredient = unIng;
    }



    public Cocktail getUnCock() {
        return cocktail;
    }

    public void setUnCock(Cocktail unCock) {
        this.cocktail = unCock;
    }

    //méthodes


}