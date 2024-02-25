package fr.epsi.banque.entites;

public abstract class Operation {

    private String date;
    private double montantoperation;

//consructeur
    public Operation(String date, double montantoperation) {
        this.date = date;
        this.montantoperation = montantoperation;
    }
//getter
    public String getDate() {
        return date;
    }
//getter
    public double getMontantoperation() {
        return montantoperation;
    }

//methode abstraite
    public abstract String affType();




}
