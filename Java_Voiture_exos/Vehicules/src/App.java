
import java.util.Scanner;
import models.Moteur;
import models.Voiture;
import models.VoitureDeCourse;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entree = new Scanner(System.in);

        // initialisation
        System.out.println("Entrez une voiture ");
        String nomVoit = entree.nextLine();
        String mod = entree.nextLine();
        double pod = entree.nextDouble();
        entree.nextLine();
        Voiture uneVoiture = new Voiture("Peugeot", "306", 1200);
        Voiture taVoiture = new Voiture(nomVoit, mod, pod);
        System.out.println(uneVoiture + "\n" + taVoiture);
        System.out.println("Paramétrez un moteur");
        String nomMoteur = entree.nextLine();
        double vitmax = entree.nextDouble();
        taVoiture.setmoteur(nomMoteur, vitmax);
        Moteur unMoteur = new Moteur("Yamaha", 240);
        uneVoiture.setmoteur(unMoteur);
        System.out.println("----------------------");

        // vitMax
        System.out.println(taVoiture + " a une vitesse de pointe de " + taVoiture.vitesseMax() + "km/h");
        System.out.println("Avec une voiture de course :");
        VoitureDeCourse f1 = new VoitureDeCourse("Aston", "Martin", 1300, "Aston", 240);
        System.out.println(f1);
        System.out.println("----------------------");
        System.out.println("Peut-on associer une ferrari avec un moteur de Jaguar ?");
        try {
            VoitureDeCourse f0 = new VoitureDeCourse("Ferrari", "Testarossa", 1500, "Jaguar", 300); // exception attendue
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        entree.close();

        System.out.println("----------------------");
        System.out.println("Programme terminé");

    }
}
