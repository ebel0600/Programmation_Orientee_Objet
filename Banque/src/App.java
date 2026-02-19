
// import java.util.Random;
import banque.Banque;
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
        // System.out.println("Veuillez renseigner vos montants à la quinzaine de chaque
        // mois");
        // Epargne.crediter(3000);
        // Random rand = new Random();
        // for (int i = 0; i < quinzaines.length; i++) {
        // // if(i>=15)
        // // Epargne.setTaux(2.5);
        // // Epargne.crediter(50);
        // quinzaines[i] = Epargne.getSolde();
        // // System.out.println("Quinzaine numero "+(i+1)+" : "+quinzaines[i]+", taux à
        // // "+Epargne.getTaux()+"%");
        // }
        // Epargne.calculerInterets(quinzaines);

        // System.out.println(Epargne);

        // tests banque

        // Initialisation des comptes
        // Banque uneBanque = new Banque("La Banque Postale");
        // Compte autreCompte = new Compte("Basile", 1300, -200);
        // uneBanque.addCompte(autreCompte);
        // Compte autreCompte2 = new Compte("Cecile", 2700, -500);
        // uneBanque.addCompte(autreCompte2);
        // uneBanque.addCompte("Aurélien", 1800, -300);
        // uneBanque.addCompte("John",1984,-666);
        // System.out.println(uneBanque);

        Banque uneBanque = new Banque();
        uneBanque.initaliser();


        //tests de tri avec comparator
        System.out.println("Voici les comptes de la banque non triés :\n" + uneBanque + "--------------------");
        uneBanque.triNoms();
        System.out.println("Puis trié par nom de propriétaire\n" + uneBanque + "--------------------");
        uneBanque.triSolde();
        System.out.println("Et enfin par solde\n" + uneBanque);

        // test rendcompte
        // Integer position = 0;
        // System.out.println("Veuillez saisir le numéro de compte :");
        // long num = entree.nextLong();
        // System.out.println(uneBanque.rendCompte(num, position) + " Trouvé en position
        // "+ position+" "+ uneBanque.getPosition());

        // //test transfert

        // System.out.println("Combien souhaitez vous transférer ?");
        // montant = entree.nextDouble();
        // entree.nextLine();
        // System.err.println("Indiquez les comptes concernés par l'opération (débiteur
        // puis bénéficiaire)");
        // long numDebit = entree.nextLong();
        // long numCredit = entree.nextLong();

        // if(uneBanque.transferer(numDebit, numCredit, montant))
        // System.out.println("Opération
        // réussie\n"+uneBanque.rendCompte(numDebit)+uneBanque.rendCompte(numCredit));
        // else
        // System.out.println("Opération annulée, solde insuffisant ou numero(s) de
        // compte
        // invalide(s)\n"+uneBanque.rendCompte(numDebit)+uneBanque.rendCompte(numCredit));

        // System.out.println("--------------------");

        // //test compteSup/inf
        // System.out.print("Qui est le plus fortuné de "+uneBanque.getNomBanque()+"
        // ?\n"+uneBanque.compteSup().toString());
        // System.out.print("Qui est le plus précaire de "+uneBanque.getNomBanque()+"
        // ?\n"+uneBanque.compteInf().toString());
        // System.out.println("--------------------");

        // //test setCompte
        // Compte compteVierge = new Compte();
        // uneBanque.addCompte(compteVierge);

        // System.out.println("Voici un compte vierge
        // :\n"+compteVierge.toString()+"Peut-on modifier celui du plus fortuné ?");
        // long numVole = uneBanque.compteSup().getNUMID();
        // if(uneBanque.setCompte(uneBanque.compteSup().getNUMID(), "Charlatan", 0, 0))
        // System.out.println("Sécurité du système défaillante, iel s'est fait
        // dépouiller par "+uneBanque.rendCompte(numVole).toString());
        // else
        // System.out.println("Non, ce compte est sécurisé.");
        // System.out.println("--------------------");

        // System.out.println("Peut-on modifier le compte vierge ?");
        // if(uneBanque.setCompte(compteVierge.getNUMID(), "Juliette", 1000, -200))
        // System.out.println("Opération réussie :\n"+compteVierge);
        // else
        // System.out.println("Echec, revoir le code de setCompte.");
        // System.out.println("--------------------");

        entree.close();

        System.out.println("Programme terminé !");

    }

}
