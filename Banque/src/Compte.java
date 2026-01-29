import java.time.LocalDateTime;

/**
 * @version 1.0
 * @created 26-janv.-2026 11:58:36
 */

public class Compte {

	private double decouvert;
	protected final String NOMPROPRIO;
	protected final long NUMID;
	protected double solde;

	/**
	 * 
	 *
	 * @param _nomProp
	 * @param _solde
	 * @param _decouvert
	 */
	public Compte(String _nomProp, double _solde, double _decouvert) {

		LocalDateTime maintenant = LocalDateTime.now();
		NUMID = Math.abs(maintenant.hashCode());
		NOMPROPRIO = _nomProp;
		solde = _solde;
		decouvert = _decouvert;
	}

	public Compte() {
		LocalDateTime maintenant = LocalDateTime.now();
		NUMID = Math.abs(maintenant.hashCode());
		NOMPROPRIO = "Anonyme";
		solde = 0;
		decouvert = 0;
	}

	public double getDecouvert() {
		return decouvert;
	}

	public String getNOMPROPRIO() {
		return NOMPROPRIO;
	}

	public long getNUMID() {
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
		if (!this.debiter(_montant))
			return false;
		else {
			_autreCompte.crediter(_montant);
			return true;
		}
	}

	public static double arrondi(double nb, int nv) {

        return (double) ((long) (nb * Math.pow(10, nv) + 0.5)) / Math.pow(10, nv);

    }

	@Override
	public String toString() {
		return "Compte numéro " + NUMID + " au nom de " + NOMPROPRIO + ", solde de " + arrondi(solde,2)
				+ " euros et découvert autorisé de " + decouvert + " euros\n";
	}

}