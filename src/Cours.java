/**
 * Classe qui permet de gerer les cours d'une action
 * @author 21400895
 *
 */
public class Cours {
	private float valeurC;
	private int numJ ;
	private int annee ;
	
	public Cours (int nj, int an, float vc){
		this.numJ = nj ;
		this.annee = an ;
		this.valeurC = vc ;
	}


	public float getValeurC() {
		return valeurC;
	}


	public int getNumJ() {
		return numJ;
	}


	public int getAnnee() {
		return annee;
	}

	
	
	

}
