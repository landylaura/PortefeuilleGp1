
public class PortefeuilleException extends Exception{


	
	public PortefeuilleException (int codeErr) {
		
		switch(codeErr){
		case 1 :
			System.err.println("Vous n'avez pas assez d'actions � vendre !! "); 
			break;
		case 2 : 
			System.err.println("Le nombre d'action � vendre doit �tre positif!!");
			break; 
		case 3 : 
			System.err.println("Le nombre d'action � acheter doit �tre positif!!");
			break; 
		}
		
	}

}
