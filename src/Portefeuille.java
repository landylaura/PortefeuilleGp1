/**
 * Classe qui permet de creer un portfeuille d'action
 */
import java.util.HashMap;

/**
 *
 * @author 21203630
 */
public class Portefeuille {
	private String libelleP ;
	private HashMap<Action, Quantite> table;
	
	/**
	 * Constructeur d'un portefeuille qui initie la structure qui contiendra pour une action (cle) sa quantite (valeur)
	 * @param l : nom du portefeuille
	 */
	public Portefeuille(String l) {
		this.table = new HashMap<Action, Quantite>();
		this.libelleP = l ;
	}
	
    /**
     *Methode pour avoir le libelle
     * @return
     */
    public String getLibelleP() {
		return libelleP;
	}
	
	/**
	 * Methode qui permet de calculer la valeur d'un portefeuille e une date donnee
	 * @param date : date donnee
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
	 * Methode qui permet d'acheter une quantite d'une action
	 * @param q : quantite e acheter
	 * @param a : action e acheter
     * @throws PortefeuilleException
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
	 * Methode qui permet de vendre une quantite d'une action
	 * @param a : action e vendre
	 * @param nbA : Nombre d'action e vendre
     * @throws PortefeuilleException
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
	 * Methode qui permet de recuperer la quantite d'une action dans un portefeuille 
	 * @param a : action
	 * @return le nombre d'action
	 */
	public Quantite getActions(Action a) {
		return this.table.get(a) ;
	}
	
	

}
