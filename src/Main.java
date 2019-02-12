
public class Main {
	
	public static void main(String[] args){ 
		
		//1 Creer une action simple
		
		ActionSimple as1, as2, as3, as4 ;
		as1 = new ActionSimple("Apple");
		as2 = new ActionSimple("Ubisoft");
		as3 = new ActionSimple("Royal Air Maroc");
		as4 = new ActionSimple("Air Madagascar");
		

		//2 Creer une action composee
		ActionCompose ac1, ac2 ;
		ac1 = new ActionCompose("Qatar Airways");
		ac1.ajouterActionSimple(as3, (float)0.4);
		ac1.ajouterActionSimple(as4, (float)0.1);
		
		ac2 = new ActionCompose("Microsoft");
		ac2.ajouterActionSimple(as1, (float)0.15);
		ac2.ajouterActionSimple(as2, (float)0.6);
		
		//3 Creer un portefeuille et acheter des actions
		Portefeuille p1 ;
		p1 = new Portefeuille("K&LCo");
		try{
			p1.acheterAction(20, as1);
		}catch(Exception e){ 
			e.printStackTrace();
		}
		
		try{
			p1.acheterAction(100, as2);
		}catch(Exception e){ 
			e.printStackTrace();
		}
		
		try{
			p1.acheterAction(50, ac1);
		}catch(Exception e){ 
			e.printStackTrace();
		}
		
		
		//4 Creer des cours
		Cours c1, c2, c3, c4 ;
		c1 = new Cours (25,2018,170);
		c2 = new Cours (26,2018,(float)18.6);
		c3 = new Cours (27,2018,(float)12.9);
		c4 = new Cours (28,2018,(float)95.6);
		
		//5 Affecter des cours e des actions
		as1.affecterCours(c1);
		as1.affecterCours(c2);
		as1.affecterCours(c3);
		as1.affecterCours(c4);
		
		as2.affecterCours(c1);
		as2.affecterCours(c2);
		as2.affecterCours(c3);
		as2.affecterCours(c4);
		
		as3.affecterCours(c1);
		as3.affecterCours(c2);
		as3.affecterCours(c3);
		as3.affecterCours(c4);
		
		as4.affecterCours(c1);
		as4.affecterCours(c2);
		as4.affecterCours(c3);
		as4.affecterCours(c4);
		
		
		//6 Afficher la valeur du portefeuille
		int numJ = 1 ;
		int annee = 2018 ;
		String date = numJ+"/"+annee ;
		
		System.out.println("Valeur du portefeuille "+ p1.getLibelleP()+ " au jour "+ numJ+ " de l\'annee "+ annee+ " est " + p1.getValeur(date)+"e");
		
		//7 Afficher le cours d'une action (simple ou compose)
		
		System.out.println(as1.getValeur("25/2018"));
		System.out.println(ac1.getValeur("25/2018"));

		//8 Acheter des actions simples
		try{
		System.out.println("Nombre d\'action " + as1.getLibelle()+ " du portefeuille "+ p1.getLibelleP()+ " est : " + p1.getActions(as1).getNbAction() );
		p1.acheterAction(-20, as1);
		
		System.out.println("Nombre d\'action " + as1.getLibelle()+ " du portefeuille "+ p1.getLibelleP()+ " apres achat est : " + p1.getActions(as1).getNbAction()+"\n" );
		} catch(Exception e){ 
			e.printStackTrace();
		}
		
		
		
		//10 Acheter des actions composees
		try{
		System.out.println("Nombre d\'action " + ac1.getLibelle()+ " du portefeuille "+ p1.getLibelleP()+ " est : " + p1.getActions(ac1).getNbAction() );
		p1.acheterAction(20, ac1);
		System.out.println("Nombre d\'action " + ac1.getLibelle()+ " du portefeuille "+ p1.getLibelleP()+ " apres achat est : " + p1.getActions(ac1).getNbAction()+"\n" );
		} catch(Exception e){ 
			e.printStackTrace();
		}
		
		
		
		
		try{
		//9 Vendre des actions simples
			System.out.println("Nombre d\'action " + as1.getLibelle()+ " du portefeuille "+ p1.getLibelleP()+ " est : " + p1.getActions(as1).getNbAction() );
			p1.vendreAction(as1, -1);
			System.out.println("Nombre d\'action " + as1.getLibelle()+ " du portefeuille "+ p1.getLibelleP()+ " apres vente est : " + p1.getActions(as1).getNbAction()+"\n" );
		} catch(Exception e){ 
			e.printStackTrace();
		}
		try{
			//11 Vendre des actions composees
			System.out.println("Nombre d\'action " + ac1.getLibelle()+ " du portefeuille "+ p1.getLibelleP()+ " est : " + p1.getActions(ac1).getNbAction() );
			p1.vendreAction(ac1, 1000);
			System.out.println("Nombre d\'action " + ac1.getLibelle()+ " du portefeuille "+ p1.getLibelleP()+ " apres vente est : " + p1.getActions(ac1).getNbAction());

		} catch(Exception e){ 
				e.printStackTrace();
		}
	}
}