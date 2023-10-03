package com.example.projetSpring.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "ingredient")
public class Ingredient implements Serializable {

    //Properties
    @Id
    private int codeing;
    @Column
    private String noming;

    @Column
    private String unitemesure;

    @OneToMany(mappedBy = "primaryKey.ingredient",
            cascade = CascadeType.ALL)
    private List<Necessiter> necessiterList;


    // constructeurs


    public Ingredient() {
    }

    public Ingredient(int codeing, String noming, String unitemesure) {
        this.codeing = codeing;
        this.noming = noming;
        this.unitemesure = unitemesure;
    }


    //get et set


    public int getCodeing() {
        return codeing;
    }

    public void setCodeing(int codeing) {
        this.codeing = codeing;
    }

    public String getNoming() {
        return noming;
    }

    public void setNoming(String noming) {
        this.noming = noming;
    }

    public String getUnitemesure() {
        return unitemesure;
    }

    public void setUnitemesure(String unitemesure) {
        this.unitemesure = unitemesure;
    }
}
