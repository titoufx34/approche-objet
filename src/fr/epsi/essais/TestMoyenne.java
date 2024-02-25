package fr.epsi.essais;

import fr.epsi.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {

        double[] tab = {1,2,3,6,7,8};
        System.out.println(CalculMoyenne.moyenne(tab));

        tab = CalculMoyenne.ajout(tab, 5);

        /*for (int i = 0; i < tab.length; i++){
            System.out.println(tab[i]);
        }*/
        System.out.println();
        System.out.printf("moyenne de %s est de %s%n ","tab",CalculMoyenne.moyenne(tab));
    }
}
