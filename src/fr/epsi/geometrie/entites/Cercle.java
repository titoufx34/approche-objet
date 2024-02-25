package fr.epsi.geometrie.entites;

public class Cercle implements ObjetGeometrique{
//attributs
    double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    //methodes
    public double perimetre() {
        double perimetre = 2* Math.PI*rayon;
        return perimetre;
        }



    public double surface(){
        double surface = Math.PI*Math.pow(rayon,2);
        return surface;
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "rayon=" + rayon +
                '}';
    }
}
