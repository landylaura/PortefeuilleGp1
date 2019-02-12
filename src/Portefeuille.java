/**
 * Classe qui permet de créer un portfeuille d'action
 */
import java.util.HashMap;

public class Portefeuille {
	private String libelleP ;
	private HashMap<Action, Quantite> table;
	
	/**
	 * Constructeur d'un portefeuille qui initie la structure qui contiendra pour une action (clé) sa quantité (valeur)
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
	 * Méthode qui permet de calculer la valeur d'un portefeuille à une date donnée
	 * @param date : date donnée
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
	 * Méthode qui permet d'acheter une quantité d'une action
	 * @param q : quantité à acheter
	 * @param a : action à acheter
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
	 * Méthode qui permet de vendre une quantité d'une action
	 * @param a : action à vendre
	 * @param nbA : Nombre d'action à vendre
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
	 * Méthode qui permet de récupérer la quantité d'une action dans un portefeuille 
	 * @param a : action
	 * @return le nombre d'action
	 */
	public Quantite getActions(Action a) {
		return this.table.get(a) ;
	}
	
	

}
