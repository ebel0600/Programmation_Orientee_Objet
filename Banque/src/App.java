
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
        //     System.out.println(unCompte.getNOMPROPRIO()+" dispose d'un solde plus important que "+autreCompte.getNOMPROPRIO());
        // else
        //     System.out.println(unCompte.getNOMPROPRIO()+" dispose d'un solde moins important que "+autreCompte.getNOMPROPRIO());
        // System.out.println("--------------------");

        //test créditer
        // System.out.println("Quelle somme "+unCompte.getNOMPROPRIO()+" souhaite-iel ajouter à son compte ?");
        // montant = entree.nextDouble();
        // entree.nextLine();
        // unCompte.crediter(montant);
        // System.out.println(unCompte+"--------------------");

        //test débiter
        // System.out.println("Quelle somme "+autreCompte.getNOMPROPRIO()+" souhaite-iel retirer de son compte ?");
        // montant = entree.nextDouble();
        // entree.nextLine();
        // if(autreCompte.debiter(montant))
        //     System.out.println(autreCompte);
        // else
        //     System.out.println("Débit impossible : le découvert autorisé est dépassé !");
        // System.out.println("--------------------");

        //test transférer
        // System.out.println("Combien "+unCompte.getNOMPROPRIO()+" souhaite-iel donner à "+autreCompte.getNOMPROPRIO()+" ?");
        // montant = entree.nextDouble();
        // entree.nextLine();
        // if(unCompte.transferer(montant, autreCompte))
        //     System.out.println(unCompte+""+autreCompte);
        // else
        //     System.out.println("Débit impossible : le découvert autorisé est dépassé pour "+unCompte.getNOMPROPRIO()+"  !");    
        // System.out.println("--------------------");

        //test epargne
        Compte_Epargne Lucie = new Compte_Epargne("Meyer", 0,1.5 );
        System.out.println(Lucie);
        double[] quinzaines = new double [24];
        // Random rand = new Random();
        System.out.println("Veuillez renseigner vos montants à la quinzaine de chaque mois");
        Lucie.crediter(100);
        for (int i = 0; i<quinzaines.length;i++){

            Lucie.crediter(50);
            quinzaines[i] = Lucie.getSolde();
            System.out.println("Quinzaine numero "+(i+1)+" : "+quinzaines[i]);
        }
        Lucie.calculerInterets(quinzaines);

        System.out.println("Valeur théorique d'intérêt perçus sur le livret A à 100e + 50 supplémentaires par quinzaine consécutivement :\n"+ Lucie);
        entree.close();

        System.out.println("Programme terminé !");

    }


}


