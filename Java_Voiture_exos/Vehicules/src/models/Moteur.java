package models;

/**
 * @version 1.0
 * @created 11-f�vr.-2026 14:15:56
 */
public class Moteur {

	private String marque;
	private double vitesseMax;

	public Moteur(){
		marque = "inconnu";
		vitesseMax = 0;
	}

	public Moteur(String _marque, double _vitMax){
		marque = _marque;
		vitesseMax = _vitMax;
	}

	public String getmarque(){
		return marque;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setmarque(String newVal){
		marque = newVal;
	}

	public double getvitesseMax(){
		return vitesseMax;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setvitesseMax(double newVal){
		vitesseMax = newVal;
	}

}