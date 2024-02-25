package fr.epsi.banque.entites;

public class TestOperation {
    public static void main(String[] args) {

        Operation[] tableau = {new Credit("fff",50),new Debit("fff",50),new Credit("ttt",400), new Debit("yyyy",520)};
        double somme = 0;
        for (Operation i : tableau) {

            if (i.affType() == "Credit" ){
                somme = somme + i.getMontantoperation();
            }
            if (i.affType() == "Debit"){
                somme = somme - i.getMontantoperation();
            }

            System.out.printf("Operation de %s le %s d'un montant de %s€%n",i.affType(),i.getDate(), i.getMontantoperation());
        }
        System.out.println(somme);





    }
}
