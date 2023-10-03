package com.example.projetSpring.entity;

import jakarta.persistence.Column;

public class DTOIngredient {


    private Integer codeing;
    private String noming;

    private String unitemesure;


    public DTOIngredient(String noming, String unitemesure) {
        this.noming = noming;
        this.unitemesure = unitemesure;
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

    public Integer getCodeing() {
        return codeing;
    }

    public void setCodeing(Integer codeing) {
        this.codeing = codeing;
    }
}
