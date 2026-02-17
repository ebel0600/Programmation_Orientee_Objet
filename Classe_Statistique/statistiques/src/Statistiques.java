
import java.util.ArrayList;
import java.util.Collections;

public class Statistiques {
    private ArrayList<Double> donnees = new ArrayList<>();

    public Statistiques(ArrayList<Double> _donnees) {
        donnees = _donnees;
        Collections.sort(donnees);
    }

    public void setDonnees(ArrayList<Double> _donnees) {
        donnees = _donnees;
        Collections.sort(donnees);
    }

    public ArrayList<Double> getdonnees() {
        return this.donnees;
    }

    public double moyenne() {
        double resultat = 0;
        for (Double donnee : donnees) {
            resultat += donnee / donnees.size();
        }

        resultat *= 100;
        long conv = (long) resultat;
        resultat = conv;
        resultat /= 100;

        return resultat;
    }

    public double ecartType() {
        double resultat = 0;
        double m = this.moyenne();
        for (Double donnee : donnees) {
            resultat += Math.pow((donnee - m), 2) / donnees.size();
        }
        resultat = Math.sqrt(resultat);

        resultat *= 100;
        long conv = (long) resultat;
        resultat = conv;
        resultat /= 100;

        return resultat;
    }

    public double quartile1() {
        // double resultat = this.moyenne() - 0.674 * this.ecartType();
        // resultat *=100;
        // long conv = (long) resultat;
        // resultat = conv;
        // resultat /= 100;      
        return donnees.get((donnees.size()+1) / 4);
    }

    public double quartile2() {
        // double resultat = this.moyenne() + 0.674 * this.ecartType();
        // resultat *=100;
        // long conv = (long) resultat;
        // resultat = conv;
        // resultat /= 100;
        return donnees.get((3*donnees.size() + 1) / 4);
    }

    public double mediane() {
        return donnees.get((donnees.size()+1) / 2);
    }

    @Override
    public String toString() {
        return "Ce jeu de données a pour moyenne " + this.moyenne() + ", mediane " + this.mediane() + ", ecart-type "
                + this.ecartType() + ", quartiles " + this.quartile1() + " et " + this.quartile2();
    }
}
