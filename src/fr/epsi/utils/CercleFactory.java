package fr.epsi.utils;

import fr.epsi.entites.Cercle;

public class CercleFactory {

    public static Cercle newcercle(double rayon) {
        return new Cercle(rayon);

    }
}
