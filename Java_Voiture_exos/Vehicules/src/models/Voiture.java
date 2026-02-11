package models;

/**
 * @version 1.0
 * @created 11-f�vr.-2026 14:14:01
 */
public class Voiture {

	protected String marque;
	protected String modele;
	protected int poids = 1000;
	public Moteur m_Moteur;

	public Voiture(){
		marque = "Inconnu";
		modele = "";
		m_Moteur = new Moteur();

	}

	public void finalize() throws Throwable {

	}

	public String getmarque(){
		return marque;
	}

	public String getmodele(){
		return modele;
	}

	public int getpoids(){
		return poids;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setpoids(int newVal){
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

	public String toString(){
		return "";
	}

	/**
	 * 
	 * @param poids
	 * @param vitesseMoteur
	 */
	public double vitesseMax(int poids, int vitesseMoteur){
		return 0;
	}

}