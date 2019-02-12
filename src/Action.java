
/** .
 * Classe abstraite qui contient la structure generique d'une action
 *
 * @author 21400895
 *
 */
public abstract class Action {

    /**
     *
     */
    private final String libelle;

    /**
     *
     * @param l
     */
    public Action(final String l) {
        this.libelle = l;
    }

    /**
     * @return le libelle.
     */
    public final String getLibelle() {
        return libelle;
    }

    /**
     * .
     * Methode abstraite heritee par les actions
     *
     * @param date : date donnee
     * @return valeur d'une action a une date donnee
     */
    public abstract float getValeur(String date);
}
