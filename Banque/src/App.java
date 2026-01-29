
//import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entree = new Scanner(System.in);
        // String nom;
        // double solde;
        // double découvert;
        // double montant;

        // System.out.println("Quel est le nom du bénéficiaire :");
        // nom = entree.nextLine();
        // System.out.println("Solde du compte :");
        // solde = entree.nextDouble();
        // entree.nextLine();
        // System.out.println("Découvert autorisé :");
        // découvert = entree.nextDouble();
        // entree.nextLine();

        // Compte unCompte = new Compte(nom,solde,découvert);
        // Compte autreCompte = new Compte("Basile", 1300, -200.45);
        // System.out.println(unCompte+""+autreCompte);

        // if(unCompte.comparer(autreCompte))
        // System.out.println(unCompte.getNOMPROPRIO()+" dispose d'un solde plus
        // important que "+autreCompte.getNOMPROPRIO());
        // else
        // System.out.println(unCompte.getNOMPROPRIO()+" dispose d'un solde moins
        // important que "+autreCompte.getNOMPROPRIO());
        // System.out.println("--------------------");

        // test créditer
        // System.out.println("Quelle somme "+unCompte.getNOMPROPRIO()+" souhaite-iel
        // ajouter à son compte ?");
        // montant = entree.nextDouble();
        // entree.nextLine();
        // unCompte.crediter(montant);
        // System.out.println(unCompte+"--------------------");

        // test débiter
        // System.out.println("Quelle somme "+autreCompte.getNOMPROPRIO()+" souhaite-iel
        // retirer de son compte ?");
        // montant = entree.nextDouble();
        // entree.nextLine();
        // if(autreCompte.debiter(montant))
        // System.out.println(autreCompte);
        // else
        // System.out.println("Débit impossible : le découvert autorisé est dépassé !");
        // System.out.println("--------------------");

        // test transférer
        // System.out.println("Combien "+unCompte.getNOMPROPRIO()+" souhaite-iel donner
        // à "+autreCompte.getNOMPROPRIO()+" ?");
        // montant = entree.nextDouble();
        // entree.nextLine();
        // if(unCompte.transferer(montant, autreCompte))
        // System.out.println(unCompte+""+autreCompte);
        // else
        // System.out.println("Débit impossible : le découvert autorisé est dépassé pour
        // "+unCompte.getNOMPROPRIO()+" !");
        // System.out.println("--------------------");

        // test epargne
        // Compte_Epargne Epargne = new Compte_Epargne("Meyer", 0, 1.5);
        // double[] quinzaines = new double[24];
        // // System.out.println("Veuillez renseigner vos montants à la quinzaine de chaque mois");
        // Epargne.crediter(3000);
        // for (int i = 0; i < quinzaines.length; i++) {
        //     // if(i>=15)
        //     // Epargne.setTaux(2.5);
        //     // Epargne.crediter(50);
        //     quinzaines[i] = Epargne.getSolde();
        //     // System.out.println("Quinzaine numero "+(i+1)+" : "+quinzaines[i]+", taux à
        //     // "+Epargne.getTaux()+"%");
        // }
        // Epargne.calculerInterets(quinzaines);

        // System.out.println(Epargne);

        //test banque
        Banque postale = new Banque("La Banque Postale");
        Compte autreCompte = new Compte("Basile", 1300, -200);
        postale.addCompte(autreCompte);
        Compte autreCompte2 = new Compte("Cecile", 2700, -500);
        postale.addCompte(autreCompte2);
        System.out.println(postale);
        System.out.println("Cecile peut elle transférer 500e à Basile ?");
        if(postale.transferer(autreCompte2.getNUMID(), autreCompte.getNUMID(), 500))
            System.out.println("Oui !\n"+postale);
        else
            System.out.println("Raté !");
        System.out.println("Basile peut-il transférer 3000e à Cécile ?");
        if(postale.transferer(autreCompte.getNUMID(), autreCompte2.getNUMID(), 3000))
            System.out.println("Oui mais ce n'était pas prévu pour être possible !");
        else
            System.out.println("Non, Basile n'a pas assez de monnaie.");

        entree.close();

        System.out.println("Programme terminé !");

    }

}
