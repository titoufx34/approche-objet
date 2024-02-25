package fr.epsi.operations;

public class CalculMoyenne {
    private static double[] tableau;

    public CalculMoyenne() {
    }

    public double[] getTableau() {
        return tableau;
    }

    public void setTableau(double[] tableau) {
        this.tableau = tableau;
    }
    // methode d'ajout d'un element "a" au tableau
    public static double[] ajout(double[] tab, double a) {

        // augmenter taille tableau de 1
        double[] newtab = new double[tab.length + 1];
        //on ajoute l'ancien tableau dans le nouveau, puis la nouvelle valeur dans la derniere case
        for (int i = 0; i < tab.length; i++)
            newtab[i] = tab[i];
        newtab[tab.length] = a;
        return newtab;
    }

    public static double moyenne(double[] tableau) {
        double somme = 0;
        for (double i : tableau) {
            somme = somme + i;
        }
        //System.out.println(somme);
        //System.out.println(tableau.length);
        double moy = somme / (tableau.length);
        //System.out.println(moy);
        return moy;
    }


}


