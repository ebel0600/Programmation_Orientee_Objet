
// import java.util.Random;
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

        //test epargne
        // Compte_Epargne Epargne = new Compte_Epargne("Meyer", 0, 1.5);
        // double[] quinzaines = new double[24];
        // System.out.println("Veuillez renseigner vos montants à la quinzaine de chaque mois");
        // Epargne.crediter(3000);
        // Random rand = new Random();
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
        postale.addCompte("Aurélien", 1800, -300);
        postale.addCompte("John",1984,-666);
        System.out.println(postale);
        System.out.println("Cecile peut elle transférer 500e à Basile ?");
        if(postale.transferer(autreCompte2.getNUMID(), autreCompte.getNUMID(), 500))
            System.out.println("Oui !");
        else
            System.out.println("Raté !");
        System.out.println("--------------------");
        System.out.println("Basile peut-il transférer 3000e à Cécile ?");
        if(postale.transferer(autreCompte.getNUMID(), autreCompte2.getNUMID(), 3000))
            System.out.println("Oui mais ce n'était pas prévu pour être possible !");
        else
            System.out.println("Non, Basile n'a pas assez de monnaie.");
        System.out.println("--------------------");
        System.out.print("Qui est le plus fortuné de "+postale.getNomBanque()+" ?\n"+postale.compteSup().toString());
        System.out.println("--------------------");
        Compte compteVierge = new Compte();
        postale.addCompte(compteVierge);

        System.out.println("Voici un compte vierge :\n"+compteVierge.toString()+"Peut-on modifier celui du plus fortuné ?");
        long numVole = postale.compteSup().getNUMID();
        if(postale.setCompte(postale.compteSup().getNUMID(), "Charlatan", 0, 0))
            System.out.println("Sécurité du système défaillante, il s'est fait dépouiller par "+postale.rendCompte(numVole).toString());
        else 
            System.out.println("Non, ce compte est sécurisé.");
        System.out.println("--------------------");
        System.out.println("Peut-on modifier le compte vierge ?");
        if(postale.setCompte(compteVierge.getNUMID(), "Juliette", 1000, -200))
            System.out.println("Opération réussie :\n"+compteVierge);
        else
            System.out.println("Echec, revoir le code de setCompte.");
        System.out.println("--------------------");

        entree.close();

        System.out.println("Programme terminé !");

    }

}
