package fr.epsi.entites;

import fr.epsi.utils.CercleFactory;

public class TestCercle {
    public static void main(String[] args) {
    /*    Cercle cercle1 = new Cercle(10);
        Cercle cercle2 = new Cercle(20);

        System.out.printf("R cercle 1 = %s%n",cercle1.getRayon());
        System.out.printf("P cercle 1 = %.02f%n",cercle1.Perimetre());
        System.out.printf("S cercle 1 = %.02f%n", cercle1.Surface());
        System.out.printf("R cercle 2 = %s%n", cercle2.getRayon());
        System.out.printf("P cercle 2 = %.02f%n",cercle2.Perimetre());
        System.out.printf("S cercle 2 = %.02f%n",cercle2.Surface());*/


    Cercle c1 = CercleFactory.newcercle(10);
        System.out.println(c1);
    Cercle c2 = CercleFactory.newcercle(20);
        System.out.println(c2);
    Cercle c3 = CercleFactory.newcercle(30);
        System.out.println(c3);
    }
}
