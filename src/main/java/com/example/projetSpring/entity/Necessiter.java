package com.example.projetSpring.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "necessiter")
@AssociationOverrides({
        @AssociationOverride(name = "primaryKey.cocktail",
        joinColumns = @JoinColumn(name = "numco")),
        @AssociationOverride(name = "primaryKey.ingredient",
                joinColumns = @JoinColumn(name = "codeing"))
})
public class Necessiter implements Serializable {

    //Properties

    //clé composite
    @EmbeddedId
    private PKnecessiter primaryKey = new PKnecessiter();

    //Champs additionnel
    @Column
    private double qteutilisee;



    // constructeurs


    public Necessiter() {
    }

    public Necessiter(PKnecessiter primaryKey, double qteutilisee) {
        this.primaryKey = primaryKey;
        this.qteutilisee = qteutilisee;
    }

    // get et set


    public PKnecessiter getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(PKnecessiter primaryKey) {
        this.primaryKey = primaryKey;
    }

    public double getQteutilisee() {
        return qteutilisee;
    }

    public void setQteutilisee(double qteutilisee) {
        this.qteutilisee = qteutilisee;
    }

    @Transient
    public Cocktail getCocktail(){
        return getPrimaryKey().getUnCock();
    }

    public void setCocktail(Cocktail unCock){
        getPrimaryKey().setUnCock(unCock);
    }

    @Transient
    public Ingredient getIngredient(){
        return getPrimaryKey().getUnIng();
    }

    public void setIngredient(Ingredient unIng){
        getPrimaryKey().setUnIng(unIng);
    }

}
