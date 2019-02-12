/**
 * Classe abstraite qui contient la structure générique d'une action
 * @author 21400895
 *
 */
public abstract class Action {
	protected String libelle ;
	
	public Action(String l) {
		this.libelle = l ;
	}

	public String getLibelle() {
		return libelle;
	}
	
	/**
	 * Méthode abstraite héritée par les actions
	 * @param date : date donnée
	 * @return valeur d'une action à une date donnée
	 */
	public abstract float getValeur(String date) ;

	
	
	

}
