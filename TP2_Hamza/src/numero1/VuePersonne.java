package numero1;

public class VuePersonne implements Observateur{

	protected Personne personne;
	protected String infosPersonne;
	
	public VuePersonne(Personne personne) {
		this.personne = personne;
		personne.ajoute(this);
		miseAjourInfos();
	}
	
	protected void miseAjourInfos() {
		infosPersonne="Nom: "+ personne.getName()+ ", État: "+ personne.getNomEtat()+ ", Points de retraite: "+personne.getPointsRetraite();
	}
	
	public void actualise() {
		miseAjourInfos();
		this.redessine();
	}
	
	public void redessine() {
		System.out.println(infosPersonne);
	}
	
}
