/**
 * Classe abstraite qui contient la structure g�n�rique d'une action
 * @author 21400895
 *
 */
public abstract class Action {
	protected String libelle ;
	
	public Action(String l) {
		this.libelle = l;
	}

        /**
         * @return  le libellé.
         */
	public String getLibelle() {
		return libelle;
	}

	/** .
	 * M�thode abstraite h�rit�e par les actions
	 * @param date : date donn�e
	 * @return valeur d'une action � une date donn�e
	 */
	public abstract float getValeur(String date);
}
