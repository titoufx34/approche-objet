package fr.epsi.chaines;

public class ManipulationChaine {
    public static void main(String[] args) {
        String chaine = "Durand;Marcel;012543;1 523.5";

        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère: " + premierCaractere);

        int longueur = chaine.length();
        System.out.println(longueur);

        int index = chaine.indexOf('c');
        System.out.println(index);

        String extrait = chaine.substring(2, 16);
        System.out.println(extrait);

        String nom = chaine.substring(chaine.indexOf('D'), chaine.indexOf(';'));
        System.out.println(nom);

        String nomcaps = chaine.substring(chaine.indexOf('D'), chaine.indexOf(';')).toUpperCase();
        System.out.println(nomcaps);

        String nomlow = chaine.substring(chaine.indexOf('D'), chaine.indexOf(';')).toLowerCase();
        System.out.println(nomlow);

        

        String[] decoupe = chaine.split(";");
        for (String item : decoupe) {
            System.out.printf(item+ " ");
        }
    }

}
