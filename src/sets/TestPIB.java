package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestPIB {
    public static void main(String[] args) {

        Pays usa = new Pays("USA",336_997_624,69_375);
        Pays france = new Pays("France",0,45_028);
        Pays allemagne = new Pays("Allemagne",83_408_554,50_787);
        Pays russie = new Pays("Russie",145_102_755,11_327);



        Set<Pays> pays = new HashSet<>();
        pays.addAll(Arrays.asList(usa,france,allemagne,russie));

        System.out.println(pays);

// pays avec pib/habitant max
        double maxpibhab = 0;
        Pays paysmaxpibhab = new Pays("vide",0,0);
        for (Pays item : pays){
            if (item.getPibparhabitants() > maxpibhab){
                maxpibhab = item.getPibparhabitants();
                paysmaxpibhab = item;

            }
        }
// pays avec PIB max
        double maxpib = 0;
        Pays paysmaxpib = new Pays("vide",0,0);
        for (Pays item : pays){
            if ((item.getPibparhabitants()*item.getNbehabitants()) > maxpib){
                maxpib = item.getPibparhabitants()*item.getNbehabitants();
                paysmaxpib = item;
            }
        }


        System.out.println("le pays avec le pib/hab max est : " +paysmaxpibhab.getNom());
        System.out.println("le pays avec le pib max est" +paysmaxpib.getNom() + " avec un PIB de : " +maxpib);

// pays avec PIB min
        double minpib = Double.MAX_VALUE;
        Pays paysminpib = new Pays("vide",0,0);
        for (Pays item : pays){
            if ((item.getPibparhabitants()*item.getNbehabitants()) < minpib){
                minpib = item.getPibparhabitants()*item.getNbehabitants();
                paysminpib = item;
            }
        }
        System.out.println("mini pib = " +paysminpib.getNom());

        pays.remove(paysminpib);
        paysminpib.setNom(paysminpib.getNom().toUpperCase());
        pays.add(paysminpib);

        System.out.println(paysminpib.getNom());


        Iterator<Pays> iterator = pays.iterator();
        while (iterator.hasNext()){
            Pays element = iterator.next();
            if (element.getPibparhabitants()*element.getNbehabitants() == minpib){
                iterator.remove();
            }
        }

        System.out.println(pays);


    }



}


