package numero1;

public abstract class Etat {
		
	protected Personne personne;
	public abstract String getNom();
	public abstract Etat changeEtat();
	public abstract void ajoutePoints(int quantite);
}
