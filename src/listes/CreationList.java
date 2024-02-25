package listes;

import java.util.ArrayList;
import java.util.List;

public class CreationList {

    public static void main(String[] args) {

        List Listeint = new ArrayList();

        for (int i =1; i<=100; i++){
            Listeint.add(i-1,i);
        }

        int taille = Listeint.size();
        System.out.println(taille);
    }
}
