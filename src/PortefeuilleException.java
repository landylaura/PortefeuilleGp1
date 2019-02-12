
public class PortefeuilleException extends Exception{


	
	public PortefeuilleException (int codeErr) {
		
		switch(codeErr){
		case 1 :
			System.err.println("Vous n'avez pas assez d'actions à vendre !! "); 
			break;
		case 2 : 
			System.err.println("Le nombre d'action à vendre doit être positif!!");
			break; 
		case 3 : 
			System.err.println("Le nombre d'action à acheter doit être positif!!");
			break; 
		}
		
	}

}
