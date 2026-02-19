package comparateurs;
import java.util.Comparator;
import banque.Compte;

public class MonComparateurSoldes implements Comparator<Compte> {
    @Override
    public int compare(Compte _unCompte, Compte _autreCompte) {
        return Double.compare(_unCompte.getSolde(), _autreCompte.getSolde());
    }
}
