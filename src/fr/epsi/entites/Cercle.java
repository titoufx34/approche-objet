package fr.epsi.entites;

public class Cercle {
    private double rayon;

// constructeur
    public Cercle(double rayon) {
        this.rayon = rayon;
    }
//perimetre
    public double Perimetre() {
        double perim = 2*Math.PI*rayon;
        return perim;
    }
// surface
    public double Surface() {
        double surf = Math.PI*Math.pow(rayon,2);
        return surf;
    }

    public double getRayon() {
        return rayon;
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "rayon=" + rayon +
                '}';
    }
}
