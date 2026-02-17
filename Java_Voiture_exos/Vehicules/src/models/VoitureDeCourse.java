package models;

/**
 * @version 1.0
 * @created 11-f�vr.-2026 14:16:16
 */
public class VoitureDeCourse extends Voiture {

	public VoitureDeCourse(String _marque, String _modele, double _poids, String _marqueMoteur, double _vitesseMax) {
		super(_marque, _modele, _poids, _marqueMoteur, _vitesseMax);
		if (!_marqueMoteur.equals(this.marque)) {
			throw new IllegalArgumentException("Incompatibilité entre le moteur et la voiture");
		}
	}

	/**
	 * 
	 * @param poids
	 * @param vitesseMoteur
	 */
	@Override
	public double vitesseMax() {
		return this.moteur.getvitesseMax() - (this.poids * 5 / 100);
	}

	@Override
	public String toString() {
		return super.toString() + " vitesse max : " + this.vitesseMax();
	}
}