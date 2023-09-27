package com.example.projetSpring.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categorie")
public class Categorie {

    //Properties
    @Id
    private Integer codecat;
    @Column
    private String libellecat;

    @OneToMany
    private List<Cocktail> lesCocktails;
    //Constructeurs

    public Categorie() {
    }

    public Categorie(int codecat, String libellecat) {
        this.codecat = codecat;
        this.libellecat = libellecat;
    }

    //get et set

    public int getCodecat() {
        return codecat;
    }

    public void setCodecat(int codecat) {
        this.codecat = codecat;
    }

    public String getLibellecat() {
        return libellecat;
    }

    public void setLibellecat(String libellecat) {
        this.libellecat = libellecat;
    }


}
