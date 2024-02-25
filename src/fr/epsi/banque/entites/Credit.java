package fr.epsi.banque.entites;

public class Credit extends Operation{

    //constructeur
    public Credit(String date, double montantoperation) {
        super(date, montantoperation);

    }
//methode
    //public double credit(){
    //    return Compte.getSoldecompte() + getMontantoperation();

    @Override
    public String affType() {
        return "Credit";
    }
}
