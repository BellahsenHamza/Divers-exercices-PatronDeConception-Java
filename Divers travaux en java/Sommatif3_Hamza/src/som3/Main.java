package som3;

public class Main {

	public static void main(String[] args) {

	Avion<Voyageur> avion1=new Avion<Voyageur>();
	//création des objets Voyageur
	Voyageur v1=new Voyageur("V1", 10);
	Voyageur v2=new Voyageur("V2", 20);
	Voyageur v3=new Voyageur("V3", 30);
	Voyageur v4=new Voyageur("V4", 40);

//attribution des places
	avion1.AttributionPlace(v1, 1);
	avion1.AttributionPlace(v2, 2);
	avion1.AttributionPlace(v3, 2);
	avion1.AttributionPlace(v4, 523);

	
	avion1.AfficherInfo();

	System.out.println("___________________________________________________________");

	
	//Affichage du numéro de place occupé par un voyageur
	
	avion1.getVoyageur(20);
	avion1.getVoyageur(30);
	System.out.println("___________________________________________________________");
	//Libération d'une place
	
	avion1.LibererPlace(2);
	avion1.LibererPlace(3);
	
	avion1.AfficherInfo();
	}

}
