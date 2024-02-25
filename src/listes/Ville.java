package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Ville {
    public static void main(String[] args) {
        String nom;
        int habitants;

        List<String> ville = new ArrayList<>();
        ville.addAll(Arrays.asList("Carcassonne, 47 800 hab.", "Narbonne, 53 400 hab.", "Lyon, 484 000 hab.", "Foix, 9 700 hab.", "Pau, 77 200 hab.", "Marseille, 850 700 hab.", "Tarbes, 40 600 hab."));

        String[] decoupe = new String[0];
        for (String item : ville) {
            decoupe = item.split(",");
            for (String element : decoupe) {
                System.out.printf(element + " ");

            }
        }

       /*String extrait = decoupe.substring(2,5);
       System.out.println(extrait);*/


    }
}
