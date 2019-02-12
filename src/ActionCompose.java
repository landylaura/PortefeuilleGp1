/**
 * Classe heritee de la classe Action
 */
import java.util.HashMap;

/**.
 *
 * @author Landy
 */
public class ActionCompose extends Action {

        /**
         * @param table : table des actions
         */
        private final HashMap<ActionSimple, Part> table;
	/**.
	 * Constructeur d'une action composee qui initie la structure
	 * @param l : nom de l'action composee
	 */
	public ActionCompose(final String l) {
		super(l);
		this.table = new HashMap<>();
	}
	/**.
	 * Methode qui permet d'ajouter une action simple a une action composee
	 * @param as : action simple
	 * @param p : pourcentage de detention de l'action simple
	 */
	public void ajouterActionSimple(ActionSimple as, float p) {
		this.table.put(as, new Part(p));
	}

	@Override
	/**.
	 * Methode qui permet de recuperer la valeur d'une action composee
	 */
	public float getValeur(String date) {
		float somme = 0;

		for (ActionSimple as  : table.keySet()) {
			somme = somme + (table.get(as).getPourcentage() * as.getValeur(date)) ;
		}

		return somme;
	}

}
