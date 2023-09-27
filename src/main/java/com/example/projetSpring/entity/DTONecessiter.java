package com.example.projetSpring.entity;

public class DTONecessiter {

    private int codeing;
    private int numco;

    private double quantite;

    public DTONecessiter(int codeing, int numco, double quantite) {
        this.codeing = codeing;
        this.numco = numco;
        this.quantite = quantite;
    }

    public int getCodeing() {
        return codeing;
    }

    public void setCodeing(int codeing) {
        this.codeing = codeing;
    }

    public int getNumco() {
        return numco;
    }

    public void setNumco(int numco) {
        this.numco = numco;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }
}
