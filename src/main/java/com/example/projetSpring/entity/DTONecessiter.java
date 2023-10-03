package com.example.projetSpring.entity;

public class DTONecessiter {

    private String codeing;
    private String numco;

    private double quantite;

    public DTONecessiter(String codeing, String numco, double quantite) {
        this.codeing = codeing;
        this.numco = numco;
        this.quantite = quantite;
    }

    public String getCodeing() {
        return codeing;
    }

    public void setCodeing(String codeing) {
        this.codeing = codeing;
    }

    public String getNumco() {
        return numco;
    }

    public void setNumco(String numco) {
        this.numco = numco;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }
}
