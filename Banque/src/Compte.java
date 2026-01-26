import java.util.UUID;

/**
 * @version 1.0
 * @created 26-janv.-2026 11:58:36
 */
public class Compte {

	private double decouvert;
	private final String NOMPROPRIO;
	private final String NUMID;
	private double solde;

	/**
	 * 
	 * @param _NUMID
	 * @param _nomProp
	 * @param _solde
	 * @param _decouvert
	 */
	public Compte(String _nomProp, double _solde, double _decouvert) {
		NUMID = UUID.randomUUID().toString().substring(0, 8);
		NOMPROPRIO = _nomProp;
		solde = _solde;
		decouvert = _decouvert;
	}

	public Compte() {
		NUMID = UUID.randomUUID().toString().substring(0,8);
		NOMPROPRIO = "Anonyme";
		solde = 0;
		decouvert = -100;
	}

	public double getDecouvert() {
		return decouvert;
	}

	public String getNOMPROPRIO() {
		return NOMPROPRIO;
	}

	public String getNUMID() {
		return NUMID;
	}

	public double getSolde() {
		return solde;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setDecouvert(double newVal) {
		decouvert = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setSolde(double newVal) {
		solde = newVal;
	}

	/**
	 * 
	 * @param _autreCompte
	 */
	public boolean comparer(Compte _autreCompte) {
		return this.solde >= _autreCompte.solde;
	}

	/**
	 * 
	 * @param _montant
	 */
	public void crediter(double _montant) {
		this.solde += _montant;
	}

	/**
	 * 
	 * @param _montant
	 */
	public boolean debiter(double _montant) {
		if (solde - _montant < decouvert)
			return false;
		else {
			solde -= _montant;
			return true;
		}
	}

	/**
	 * @param _montant
	 * @param _autreCompte
	 */
	public boolean transferer(double _montant, Compte _autreCompte) {
		if(!this.debiter(_montant))
			return false;
		else{
			_autreCompte.crediter(_montant);
			return true;
		}
	}

        @Override
	public String toString() {
		return "Le compte numéro " + NUMID + " au nom de " + NOMPROPRIO + " a un solde de " + solde
				+ " euros et un découvert autorisé de " + decouvert + " euros\n";
	}

	

}