package com.example.projetSpring.entity;

public class DTOCocktail {
    private Integer numco;
    private String nomco;
    private String datecreationco;
    private String explicationco;
    private String image;
    private Integer numcat;

    // Les getters et les setters pour ces champs


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getNumco() {
        return numco;
    }

    public void setNumco(Integer numco) {
        this.numco = numco;
    }

    public String getNomco() {
        return nomco;
    }

    public void setNomco(String nomco) {
        this.nomco = nomco;
    }

    public String getDatecreationco() {
        return datecreationco;
    }

    public void setDatecreationco(String datecreationco) {
        this.datecreationco = datecreationco;
    }

    public String getExplicationco() {
        return explicationco;
    }

    public void setExplicationco(String explicationco) {
        this.explicationco = explicationco;
    }

    public Integer getNumcat() {
        return numcat;
    }

    public void setNumcat(Integer numcat) {
        this.numcat = numcat;
    }
}
