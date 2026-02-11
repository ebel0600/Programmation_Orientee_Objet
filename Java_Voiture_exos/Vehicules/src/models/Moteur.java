package models;

/**
 * @version 1.0
 * @created 11-f�vr.-2026 14:15:56
 */
public class Moteur {

	private String marque;
	private int vitesseMax;

	public Moteur(){

	}

	public void finalize() throws Throwable {

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

	public int getvitesseMax(){
		return vitesseMax;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setvitesseMax(int newVal){
		vitesseMax = newVal;
	}

}