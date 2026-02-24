
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Statistiques {
    private List<Double> donnees = new ArrayList<>();

    public Statistiques(List<Double> _donnees) {
        donnees = _donnees;
        Collections.sort(donnees);
    }

    public void setDonnees(List<Double> _donnees) {
        donnees = _donnees;
        Collections.sort(donnees);
        // donnees.sort(Comparator.naturalOrder());
        // donnees.sort(Comparator.reverseOrder());

    }

    public List<Double> getdonnees() {
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

        int nbelements = this.donnees.size();
        ArrayList<Double> res = new ArrayList<>();

        //sous-tableaux
        List<Double> tab1 = new ArrayList<>(); 
        List<Double> tab2 = new ArrayList<>(); 

        tab1 = this.donnees.subList(0, nbelements/2);
        tab2 = this.donnees.subList(nbelements/2, nbelements);
        
        Statistiques subStat1 = new Statistiques(tab1);
        Statistiques subStat2 = new Statistiques(tab2);
        
        //resultats
        res.add(subStat1.mediane());
        res.add(this.mediane());
        res.add(subStat2.mediane());

        return res;

        // if (nbelements % 4 == 0) {
        //     res.add((donnees.get(nbelements / 4) + donnees.get((nbelements / 4) - 1)) / 2);
        //     res.add((donnees.get(nbelements / 2) + donnees.get((nbelements / 2) - 1)) / 2);
        //     res.add((donnees.get(nbelements * 3 / 4) + donnees.get((nbelements * 3 / 4) - 1)) / 2);
        // }

        // res.add(donnees.get(nbelements / 4));
        // res.add(donnees.get(nbelements / 2));
        // res.add(donnees.get(nbelements * 3 / 4));

        //return res;
    }

    public double mediane() {
        int nbelements = donnees.size();
        if (donnees.size() % 2 == 0)
            return (donnees.get((nbelements / 2)-1) + donnees.get(nbelements / 2)) / 2;
        else
            return donnees.get((nbelements+1 / 2)-1);
    }


    @Override
    public String toString() {
        return "Ce jeu de données a pour moyenne " + this.moyenne() + ", mediane " + this.mediane() + ", ecart-type "
                + this.ecartType() + ", quartiles " + this.quartiles().get(0) + " et " + this.quartiles().get(2);
    }
}
