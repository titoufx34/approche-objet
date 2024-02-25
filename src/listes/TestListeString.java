package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;




public class TestListeString {
    public static void main(String[] args) {
        List<String> ville = new ArrayList<>();
        ville.addAll(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));

        int tailleref = ville.get(0).length();
        int tailleinit = 0;
        String pluslong = "";
        for (int i = 0; i < ville.size(); i++) {
            tailleinit = ville.get(i).length();
            if (tailleinit > tailleref) {
                tailleref = tailleinit;
                pluslong = ville.get(i);
            }
        }
        System.out.println("le nom de ville le plus long :" +pluslong);

        for (int i = 0; i < ville.size(); i++) {
            ville.set(i,ville.get(i).toUpperCase());
        }
        System.out.println(ville);

        /*recherche et suppression si commence par N ---> Utiliser Iterator, car la on change la taille de la liste
        for (int i = 0; i < ville.size(); i++) {
            if (ville.get(i).startsWith("N") == true) {
                ville.remove(ville.get(i));
            }
        }
        System.out.println(ville);*/

    }

}
