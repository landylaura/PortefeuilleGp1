
/**.
 * Classe qui permet de gerer les cours d'une action
 *
 * @author 21400895
 *
 */
public class Cours {
    /**    */
    private final float valeurC;
    /**    */
    private final int numJ;
    /**    */
    private final int annee;

    /**
     *
     * @param nj int
     * @param an int
     * @param vc fload
     */
    public Cours(final int nj, final int an, final float vc) {
        this.numJ = nj;
        this.annee = an;
        this.valeurC = vc;
    }

    /**
     *
     * @return valeurC
     */
    public final float getValeurC() {
        return valeurC;
    }

    /**
     *
     * @return numJ
     */
    public final int getNumJ() {
        return numJ;
    }

    /**
     *
     * @return annee
     */
    public final int getAnnee() {
        return annee;
    }

}
