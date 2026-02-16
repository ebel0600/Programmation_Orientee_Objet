
import java.util.ArrayList;

public class Statistiques {
    private ArrayList<Double> donnees = new ArrayList<>();

    public Statistiques (ArrayList<Double> _donnees){
        donnees = _donnees;
    }

    public void setDonnees (ArrayList<Double> _donnees){
        donnees = _donnees;
    }

    public double moyenne(){
        double resultat = 0;
        for (Double donnee : donnees) {
            resultat += donnee/donnees.size();
        }
        return resultat;
    }

    public double ecartType(){
        double resultat = 0;
        double m = this.moyenne();
        for (Double donnee : donnees) {
            resultat += Math.pow((donnee - m), 2)/donnees.size(); 
        }
        resultat = Math.sqrt(resultat);
        return resultat;
    }

    

}
