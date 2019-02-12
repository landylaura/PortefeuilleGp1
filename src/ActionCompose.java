/**
 * Classe h�rit�e de la classe Action
 */
import java.util.HashMap;
//Ok guyys, this is my first comment 
public class ActionCompose extends Action{
	
	private HashMap<ActionSimple, Part> table;

	/**
	 * Constructeur d'une action compos�e qui initie la structure qui contiendra pour une action simple donn�e (cl�) son pourcentage de d�tention (valeur)
	 * @param l : nom de l'action compos�e
	 */
	public ActionCompose(String l) {
		super(l);
		this.table = new HashMap<ActionSimple, Part>();
	}
	
	/**
	 * M�thode qui permet d'ajouter une action simple � une action compos�e
	 * @param as : action simple
	 * @param p : pourcentage de d�tention de l'action simple
	 */
	public void ajouterActionSimple(ActionSimple as, float p) {			
		this.table.put(as, new Part(p)); 
	}
	
	@Override
	/**
	 * M�thode qui permet de r�cup�rer la valeur d'une action compos�e
	 */
	public float getValeur(String date) {
		float somme = 0 ;
		
		for (ActionSimple as  : table.keySet()){
			somme = somme + (table.get(as).getPourcentage() * as.getValeur(date)) ;
		}
			
		return somme ;
	}
	 
	 
	

}
