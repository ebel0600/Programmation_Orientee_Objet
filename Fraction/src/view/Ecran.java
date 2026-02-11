package view;

import java.util.LinkedList;
import models.Fraction;

public class Ecran {
    public static void affiche(Fraction f) {
        if (f.getdenominateur() == 1)
            System.out.println(f.getNumerateur());
        else
            System.out.println(f);
    }

    public static void afficheFractions(LinkedList<Fraction> fractions) {
        for (Fraction fraction : fractions) {
            System.out.print("Fraction numéro " + (fractions.indexOf(fraction)+1) + " : ");
            affiche(fraction);          
        }
    }

}
