
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
        // donnees.sort(Comparator.naturalOrder());
        // donnees.sort(Comparator.reverseOrder());

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

    public ArrayList<Double> quartiles() {
        int nbelements = donnees.size();
        ArrayList<Double> res = new ArrayList<>();
        if (nbelements % 2 == 0) {
            res.add((donnees.get(nbelements / 4) + donnees.get((nbelements / 4) - 1)) / 2);
            res.add((donnees.get(nbelements / 2) + donnees.get((nbelements / 2) - 1)) / 2);
            res.add((donnees.get(nbelements * 3 / 4) + donnees.get((nbelements * 3 / 4) - 1)) / 2);
            return res;
        }

        res.add(donnees.get(nbelements / 4));
        res.add(donnees.get(nbelements / 2));
        res.add(donnees.get(nbelements * 3 / 4));
        return res;
    }

    public double mediane() {
        int nbelements = donnees.size();
        if (donnees.size() % 2 == 0)
            return (donnees.get(nbelements / 2) + donnees.get((nbelements / 2) - 1)) / 2;
        else
            return donnees.get(nbelements / 2);
    }

    @Override
    public String toString() {
        return "Ce jeu de données a pour moyenne " + this.moyenne() + ", mediane " + this.mediane() + ", ecart-type "
                + this.ecartType() + ", quartiles " + this.quartiles().get(0) + " et " + this.quartiles().get(2);
    }
}
