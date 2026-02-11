
import java.util.LinkedList;
import java.util.Scanner;
import models.Fraction;
import view.Ecran;

public class App {
        public static void main(String[] args) throws Exception {
                Scanner entree = new Scanner(System.in);
                Fraction f1 = new Fraction(12, 7); // dans ce cas le numérateur vaudra 12 et le dénominateur 7
                Fraction f2 = new Fraction(); // fraction nulle de dénominateur 1
                Fraction f3 = new Fraction(9); // fraction dont le numérateur vaut 9 et le dénominateur 1
                System.out.println("Constructeur de fraction à 2 paramètres :");
                Ecran.affiche(f1);
                System.out.println("Constructeur à vide :");
                Ecran.affiche(f2);
                System.out.println("Constructeur de fraction à 1 seul paramètre :");
                Ecran.affiche(f3);
                System.out.println("--------------------------");

                // Test superieur / inferieur
                System.out.println("Veuillez entrer les valeurs de 3 fractions");
                Fraction f4 = new Fraction(entree.nextInt(), entree.nextInt());
                Fraction f5 = new Fraction(entree.nextInt(), entree.nextInt());
                Fraction f6 = new Fraction(entree.nextInt(), entree.nextInt());
                System.out.println(
                                "Est ce que " + f4.toString() + " est superieur à " + f5.toString() + " ? "
                                                + f4.superieur(f5));
                System.out.println(
                                "Est ce que " + f5.toString() + " est inferieur à " + f6.toString() + " ? "
                                                + f5.inferieur(f6));
                System.out.println("--------------------------");

                // test exception
                // System.out.println("Test de gestion de l'exception denominateur : 15 / 0");
                // Fraction f0 = new Fraction(15, 0); // exception expected
                // Ecran.affiche(f0);
                //  System.out.println("--------------------------");

                //test réduire
                System.out.println("Test de reduction de 120/-150");
                Fraction f7 = new Fraction(120, -150);
                Ecran.affiche(f7);
                System.out.println("--------------------------");

                //tests calculs
                System.out.println("Tests de calculs\nTest d'addidtion : " + f4 + " + " + f5 + " = " + f4.somme(f5)
                                + "\nTest de soustraction : " + f4 + " - " + f5 + " = " + f4.difference(f5)
                                + "\nTest de multiplication : " + f4 + " * " + f5 + " = " + f4.produit(f5)
                                + "\nTest de division : " + f4 + " / " + f5 + " = " + f4.quotient(f5)
                                + "\nTest de puissance : " + f4 + " puissance 4  = " + f4.puissance(4));
                System.out.println("--------------------------");

                //test operation unaires
                System.out.print("Opposé de " + f4 + " = ");
                f4.oppose();
                Ecran.affiche(f4);
                System.out.println("--------------------------");
                System.out.print("Inverse de " + f5 + " = ");
                f5.inverse();
                Ecran.affiche(f5);
                System.out.println("--------------------------");

                //test afficherFractions
                LinkedList<Fraction> maListe = new LinkedList<>();
                maListe.add(f1);
                maListe.add(f2);
                maListe.add(f3);
                maListe.add(f4);
                maListe.add(f5);
                maListe.add(f6);
                Ecran.afficheFractions(maListe);

                //fin
                entree.close();
                System.out.println("Programme terminé");
        }
}