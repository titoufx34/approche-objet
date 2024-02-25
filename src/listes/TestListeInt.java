package listes;

import java.util.ArrayList;
import java.util.Arrays;


public class TestListeInt {
    public static void main(String[] args) {

        ArrayList<Integer> listint = new ArrayList<>();
        listint.addAll(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
        /*listint.add(5);
        listint.add(5);
        listint.add(5);
        listint.add(5);
        listint.add(5);*/

        System.out.println(listint);

        /*for (int i = 0; i < listint.size(); i++) {
            int element = listint.get(i);
            System.out.printf(element + " %n");
        }*/
        System.out.println("taille de la liste : " + listint.size());

        //max de la list
        int max = listint.get(0);
        for (int i = 0; i < listint.size(); i++) {
            if (listint.get(i) > max) {
                max = listint.get(i);
            }
        }

        System.out.println("le max de la liste est : " + max);

        //min de la list
        int min = listint.get(0);
        for (int i = 0; i < listint.size(); i++) {
            if (listint.get(i) < min) {
                min = listint.get(i);
            }
        }
        System.out.println("le min de la liste est : " + min);
        System.out.println(listint.size());

        //recherche des < 0 et passage en >0
        for (int i = 0; i < listint.size(); i++) {
            if (listint.get(i) < 0) {
                listint.set(i, (-1 * listint.get(i)));
            }
        }

        System.out.println(listint);
    }
}
