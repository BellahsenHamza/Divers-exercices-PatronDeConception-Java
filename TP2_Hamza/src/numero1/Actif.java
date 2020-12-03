package numero1;

public class Actif extends Etat {

	
	public String getNom(){
		return "Actif";
	}

	public void ajoutePoints(int quantite) {
		personne.setPointsRetraite(personne.getPointsRetraite()+quantite);
	}
	//lors du deuxi�me changement d'�tat, une personne passe de la vie active � la retraite
	public Etat changeEtat() {
		return new Retraite();
	}
}
