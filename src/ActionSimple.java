/**
 * Classe héritée de la classe Action
 */

import java.util.HashMap;

public class ActionSimple extends Action {
	private HashMap<String, Cours> tableCours;
	
	/**
	 * Constructeur d'une action simple qui initie la structure qui contiendra pour une date donnée (clé) son cours (valeur)
	 * @param l : nom de l'action simple
	 */
	public ActionSimple(String l) {
		super(l);
		this.tableCours = new HashMap <String, Cours>();
	}
	
	/**
	 * Méthode qui permet d'affecter un cours à une date donnée
	 * @param c : cours de l'action
	 */
	public void affecterCours(Cours c) {
		String clef;
		clef = c.getNumJ()+"/"+c.getAnnee();
		
		this.tableCours.put(clef, c); 
	}

	
	@Override
	/**
	 * Méthode qui permet de récupérer la valeur d'une action simple à une date donnée 
	 */
	public float getValeur(String date) {
		float coursNul = 0;
		
		if (tableCours.containsKey(date)){
			return this.tableCours.get(date).getValeurC();
		}else{
			return coursNul;
		}
		
	}

	
}

