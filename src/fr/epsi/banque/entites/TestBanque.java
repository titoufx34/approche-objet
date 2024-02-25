package fr.epsi.banque.entites;

import java.util.Arrays;

public class TestBanque {
    public static void main(String[] args) {
        /*Compte compte1 = new Compte(1526, 30.39);

        System.out.println(compte1.getNumerocompte()+ " "+ compte1.getSoldecompte()+"€");

        System.out.println(compte1); //on appelle la methode overidée "toString" ici
        String infocompte = compte1.toString(); //si on veut l'appeler en mode "pas fin" : toString retourne un String à stocker et afficher
        System.out.println(infocompte);*/


        Compte[] tableau = {new Compte(1518,20), new CompteTaux(1515,1500,5)};

        System.out.println(Arrays.toString(tableau));

    }
}
