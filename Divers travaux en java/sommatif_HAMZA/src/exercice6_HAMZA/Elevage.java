package exercice6_HAMZA;

public class Elevage {

	private int noCheval;
	private String nom;
	private int poids;
	
	public Elevage() {
		super();
	}
	public Elevage(int noCheval, String nomCheval, int poids) {
		super();
		this.noCheval = noCheval;
		this.nom = nomCheval;
		this.poids = poids;
	}
	public int getNoCheval() {
		return noCheval;
	}
	public void setNoCheval(int noCheval) {
		this.noCheval = noCheval;
	}
	public String getNom() {
		return nom;
	}
	public void setNomCheval(String nomCheval) {
		this.nom = nomCheval;
	}
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}
	//redéfinition de la méthode equals
	public boolean equals(Object obj) {
		Elevage el;
		if (obj ==null || obj.getClass()!=this.getClass())
		 {
		 return false;
		 }
		 else
		 {
			 el=(Elevage)obj;
			 if (el.getNom().equals(getNom())& el.getNoCheval()==getNoCheval() & el.getPoids()==getPoids())
			 {
			 return true;
			 }
			 else
			 {
			 return false;
			 }
		 }
	}
	//redéfinition de la méthode hashCode
	public int hashCode() {
		return this.getNom().hashCode()+(int)this.getNoCheval()+(int)this.getPoids();
	}
	//redéfinition de la méthode toString
    public String toString() {
    	return "NOM: "+getNom()+"; Poids: "+getPoids()+"; NoCheval: "+getNoCheval();
    }


	
}
