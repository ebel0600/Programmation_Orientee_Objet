package models;

/**
 * @version 1.0
 * @created 05-f�vr.-2026 15:48:27
 */
public class Fraction {
	// attributs
	private int denominateur;
	private int numerateur;

	public Fraction() {
		numerateur = 0;
		denominateur = 1;
	}

	/**
	 * 
	 * @param _numerateur
	 */
	public Fraction(int _numerateur) {
		numerateur = _numerateur;
		denominateur = 1;
	}

	/**
	 * 
	 * @param _denominateur
	 * @param _numerateur
	 */
	public Fraction(int _numerateur, int _denominateur) {
		numerateur = _numerateur;
		try {
			double resultat = numerateur / _denominateur;
			denominateur = _denominateur;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage() + " division par 0 impossible");
		}
		this.reduire();
	}

	public int getdenominateur() {
		return denominateur;
	}

	public int getNumerateur() {
		return numerateur;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setdenominateur(int newVal) {
		try {
			double resultat = numerateur / newVal;
			denominateur = newVal;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage() + " division par 0 impossible");
		}
		denominateur = newVal;
		this.reduire();
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNumerateur(int newVal) {
		numerateur = newVal;
		this.reduire();
	}

	private int getPgcd() {
		int a = this.numerateur;
		int b = this.denominateur;
		int pgcd = -1;
		if (a != 0 && b != 0) {
			if (a < 0)
				a = -a;
			if (b < 0)
				b = -b;
			while (a != b) {
				if (a < b)
					b -= a;
				else
					a -= b;
			}
			pgcd = a;
		}
		return pgcd;
	}

	private void reduire() {
		int pgcd = this.getPgcd();
		numerateur /= pgcd;
		denominateur /= pgcd;
		if (denominateur < 0) {
			{
				numerateur = -numerateur;
				denominateur = -denominateur;
			}
		}

	}

	/**
	 * 
	 * @param _fraction
	 */
	public boolean superieur(Fraction _fraction) {
		return (double) this.numerateur / (double) this.denominateur > (double) _fraction.numerateur
				/ (double) _fraction.denominateur;
	}

	/**
	 * 
	 * @param _fraction
	 */
	public boolean inferieur(Fraction _fraction) {
		return (double) this.numerateur / (double) this.denominateur < (double) _fraction.numerateur
				/ (double) _fraction.denominateur;
	}

	/**
	 * 
	 * @param _fraction
	 */
	public boolean egal(Fraction _fraction) {
		return (double) this.numerateur / (double) this.denominateur == (double) _fraction.numerateur
				/ (double) _fraction.denominateur;
	}

	/**
	 * 
	 * @param _fraction
	 */
	public Fraction somme(Fraction _fraction) {
		int terme1 = this.numerateur * _fraction.getdenominateur();
		int terme2 = _fraction.getNumerateur() * this.denominateur;
		int diviseurCommun = this.denominateur * _fraction.getdenominateur();
		Fraction resultat = new Fraction();
		resultat.numerateur = terme1 + terme2;
		resultat.denominateur = diviseurCommun;
		resultat.reduire();
		return resultat;
	}

	/**
	 * 
	 * @param _fraction
	 */
	public Fraction difference(Fraction _fraction) {
		// int terme1 = this.numerateur * _fraction.getdenominateur();
		// int terme2 = _fraction.getNumerateur() * this.denominateur;
		// int diviseurCommun = this.denominateur * _fraction.getdenominateur();
		// Fraction resultat = new Fraction();
		// resultat.numerateur = terme1 - terme2;
		// resultat.denominateur = diviseurCommun;
		// resultat.reduire();
		// return resultat;

		//corrigé
		_fraction.oppose();
		Fraction nouvFraction = this.somme(_fraction);
		//optionnel
		_fraction.oppose();
		return nouvFraction;
	}

	/**
	 * 
	 * @param _fraction
	 */
	public Fraction produit(Fraction _fraction) {
		Fraction resultat = new Fraction(this.numerateur * _fraction.getNumerateur(),
				_fraction.getdenominateur() * this.denominateur);
		return resultat;
	}

	/**
	 * 
	 * @param _fraction
	 */
	public Fraction quotient(Fraction _fraction) {
		Fraction resultat = new Fraction(this.numerateur * _fraction.getdenominateur(),
				_fraction.getNumerateur() * this.denominateur);
		return resultat;
	}

	/**
	 * 
	 * @param exposant
	 */
	public Fraction puissance(int exposant) {
		Fraction resultat = new Fraction((int) Math.pow(this.numerateur, exposant),
				(int) Math.pow(this.denominateur, exposant));
		return resultat;
	}

	public void oppose() {
		numerateur = -numerateur;
	}

	public void inverse() {
		int temp = numerateur;
		numerateur = denominateur;
		denominateur = temp;
		this.reduire();
	}

	@Override
	public String toString() {
		return numerateur + "/" + denominateur;
	}
}