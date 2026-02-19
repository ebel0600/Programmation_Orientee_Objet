package banque;
import java.time.LocalDateTime;
import java.util.Random;

/**
 * @version 1.0
 * @created 26-janv.-2026 11:58:36
 */

public class Compte implements Comparable<Compte>{

	private double decouvert;
	protected String nomProprio;
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
		Random rand = new Random();
		NUMID = Math.abs(maintenant.hashCode() + rand.nextLong(10000000));
		nomProprio = _nomProp;
		solde = _solde;
		decouvert = _decouvert;
	}

	public Compte() {
		LocalDateTime maintenant = LocalDateTime.now();
		Random rand = new Random();
		NUMID = Math.abs(maintenant.hashCode() + rand.nextLong(10000000));
		nomProprio = "Anonyme";
		solde = 0;
		decouvert = 0;
	}

	public double getDecouvert() {
		return decouvert;
	}

	public String getnomProprio() {
		return nomProprio;
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

	public boolean setnomProprietaire(String _nouvNom) {
		if (this.nomProprio.equals("Anonyme")) {

			this.nomProprio = _nouvNom;
			return true;
		} else {
			return false;
		}
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
	public int compareTo(Compte _autreCompte){
		return Double.compare(this.solde, _autreCompte.getSolde());
	}

	@Override
	public String toString() {
		return "Compte numéro " + NUMID + " au nom de " + nomProprio + ", solde de " + arrondi(solde, 2)
				+ " euros et découvert autorisé de " + decouvert + " euros\n";
	}
}


