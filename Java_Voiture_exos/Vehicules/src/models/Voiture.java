package models;

/**
 * @version 1.0
 * @created 11-f�vr.-2026 14:14:01
 */
public class Voiture {

	protected String marque;
	protected String modele;
	protected double poids = 1000;
	protected Moteur moteur;

	public Voiture(){
		marque = "Inconnu";
		modele = "";
	}


	public Voiture(String _marque, String _modele, double _poids){
		marque = _marque;
		modele = _modele;
		poids = _poids;
	}

	public Voiture(String _marque, String _modele, double _poids, Moteur _moteur){
		marque = _marque;
		modele = _modele;
		poids = _poids;
		moteur = _moteur;
	}

	public String getmarque(){
		return marque;
	}

	public String getmodele(){
		return modele;
	}

	public double getpoids(){
		return poids;
	}

	public Moteur getMoteur(){
		return moteur;
	}
	/**
	 * 
	 * @param newVal
	 */
	public void setpoids(double newVal){
		poids = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setmodele(String newVal){
		modele = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setmarque(String newVal){
		marque = newVal;
	}

        @Override
	public String toString(){
		return marque + " " + modele + "," + poids + "kgs";
	}

	/**
	 * 
	 * @param poids
	 * @param vitesseMoteur
	 */
	public double vitesseMax(){
		return this.moteur.getvitesseMax() - (this.poids * 10/100); // 10% contrairment au 30% irréalistes de la consigne
	}

}