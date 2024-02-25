package fr.epsi.geometrie.entites;

public class Rectangle implements ObjetGeometrique{
    //attributs
    double largeur;
    double longueur;

    public Rectangle(double largeur, double longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    //methodes
    public double perimetre() {
        double perimetre = 2 * (largeur + longueur);
        return perimetre;
    }



    public double surface(){
        double surface = largeur * longueur;
        return surface;
    }
}
