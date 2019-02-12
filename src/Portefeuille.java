/**
 * Classe qui permet de cr�er un portfeuille d'action
 */
import java.util.HashMap;

public class Portefeuille {
	private String libelleP ;
	private HashMap<Action, Quantite> table;
	
	/**
	 * Constructeur d'un portefeuille qui initie la structure qui contiendra pour une action (cl�) sa quantit� (valeur)
	 * @param l : nom du portefeuille
	 */
	public Portefeuille(String l) {
		this.table = new HashMap<Action, Quantite>();
		this.libelleP = l ;
	}
	
	public String getLibelleP() {
		return libelleP;
	}
	
	/**
	 * M�thode qui permet de calculer la valeur d'un portefeuille � une date donn�e
	 * @param date : date donn�e
	 * @return valeur du portefeuille
	 */
	public float getValeur(String date) {
		float somme = 0 ;
		
		for (Action a  : table.keySet()){
			somme = somme + (table.get(a).getNbAction() * a.getValeur(date)) ;
		}
			
		return somme ;
	}
	
	/**
	 * M�thode qui permet d'acheter une quantit� d'une action
	 * @param q : quantit� � acheter
	 * @param a : action � acheter
	 */
	public void acheterAction(int q, Action a)throws PortefeuilleException {		
		
		
		if (q<0){
			throw new PortefeuilleException(3);
		}
		
		if (table.containsKey(a)){
			int nbActuel = table.get(a).getNbAction();
			int nouveauNbA = nbActuel + q ;
			this.table.put(a, new Quantite(nouveauNbA)); 
		} else {
			this.table.put(a, new Quantite(q)); 
		}

	}
	
	/**
	 * M�thode qui permet de vendre une quantit� d'une action
	 * @param a : action � vendre
	 * @param nbA : Nombre d'action � vendre
	 */
	public void vendreAction(Action a, int nbA) throws PortefeuilleException {
		int nbATotal = table.get(a).getNbAction() ;
	
		if (nbA>nbATotal){
				throw new PortefeuilleException(1);
		}
		
		if (nbA<0){
			throw new PortefeuilleException(2);
		}
	
		
		if (nbATotal == nbA) {
			table.remove(a);
		} else if (nbA < nbATotal){
			table.put(a,new Quantite (nbATotal -nbA));
		}
		
	}
	
	
	
	
	
	
	
	
	/**
	 * M�thode qui permet de r�cup�rer la quantit� d'une action dans un portefeuille 
	 * @param a : action
	 * @return le nombre d'action
	 */
	public Quantite getActions(Action a) {
		return this.table.get(a) ;
	}
	
	

}
