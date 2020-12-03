package numero1;

public class Personne extends Sujet {

	protected String name;
	protected Etat etat;
	protected int pointsRetraite;
	
	public Personne(String name, int pointsRetraite) {
		this.name = name;
		this.pointsRetraite = pointsRetraite;
		this.etat=new Etudiant();
	}
	
	public String getName() {
		return name;
	}

	public int getPointsRetraite() {
		return pointsRetraite;
	}

	public void setPointsRetraite(int pointsRetraite) {
		this.pointsRetraite = pointsRetraite;
	}
	public String getNomEtat() {
		return etat.getNom();
	}
	public void changeEtat() {
		etat=etat.changeEtat();
		this.notifie();
	}
	public void ajoutePoints(int quantite) {
		etat.personne=this;
		etat.ajoutePoints(quantite);
		this.notifie();
	}
	
	
	
}
