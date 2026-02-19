package comparateurs;
import banque.Compte;
import java.util.Comparator;

public class MonComparateurNoms implements Comparator<Compte> {
	@Override
	public int compare(Compte _unCompte, Compte _autreCompte) {
		return _unCompte.getnomProprio().compareTo(_autreCompte.getnomProprio());
	}
}
