package numero1;

public class Retraite extends Etat {
	
	public String getNom(){
		return "Retraite";
	}

	public void ajoutePoints(int quantite) {
		//Aucun comportement
	}
	
	public Etat changeEtat() {
		return this;
		//Il n'y a aucun état après la retraite
	}

}
