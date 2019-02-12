/**
 * Classe héritée de la classe Action
 */
import java.util.HashMap;

public class ActionCompose extends Action{
	
	private HashMap<ActionSimple, Part> table;

	/**
	 * Constructeur d'une action composée qui initie la structure qui contiendra pour une action simple donnée (clé) son pourcentage de détention (valeur)
	 * @param l : nom de l'action composée
	 */
	public ActionCompose(String l) {
		super(l);
		this.table = new HashMap<ActionSimple, Part>();
	}
	
	/**
	 * Méthode qui permet d'ajouter une action simple à une action composée
	 * @param as : action simple
	 * @param p : pourcentage de détention de l'action simple
	 */
	public void ajouterActionSimple(ActionSimple as, float p) {			
		this.table.put(as, new Part(p)); 
	}
	
	@Override
	/**
	 * Méthode qui permet de récupérer la valeur d'une action composée
	 */
	public float getValeur(String date) {
		float somme = 0 ;
		
		for (ActionSimple as  : table.keySet()){
			somme = somme + (table.get(as).getPourcentage() * as.getValeur(date)) ;
		}
			
		return somme ;
	}
	 
	 
	

}
