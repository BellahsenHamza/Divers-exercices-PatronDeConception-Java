package numero1;

public class Etudiant extends Etat {

	
	public String getNom(){
		return "�tudiant";
	}

	public void ajoutePoints(int quantite) {
		//Aucun comportement
	}
	//lors du premier changement d'�tat, une personne passe de la vie �tudiante � la vie active
	public Etat changeEtat() {
		return new Actif();
	}
}
