package numero1;

public class Etudiant extends Etat {

	
	public String getNom(){
		return "Étudiant";
	}

	public void ajoutePoints(int quantite) {
		//Aucun comportement
	}
	//lors du premier changement d'état, une personne passe de la vie étudiante à la vie active
	public Etat changeEtat() {
		return new Actif();
	}
}
