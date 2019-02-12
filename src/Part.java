
/**
 * Classe qui permet d'associer  une action son pourcentage de detention dans
 * une action compose.
 *
 * @author 21400895
 *
 */
public class Part {

    /**
     * @param pourcentage : le %
     */
    private final float pourcentage;

    /**
     * Constructeur d'une part.
     *
     * @param p : la part.
     */
    public Part(final float p) {
        this.pourcentage = p;
    }

    /**
     * @return pourcentage : le pourcentage.
     */
    public final float getPourcentage() {
        return pourcentage;
    }
}
