package exercice6_HAMZA;

public class Employe {

	private String nom;
	private String prenom;
	private int matricule;
	private int noEmploye;
	
	public Employe(String nom, String prenom, int matricule, int noEmploye) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
		this.noEmploye = noEmploye;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	public int getNoEmploye() {
		return noEmploye;
	}
	public void setNoEmploye(int noEmploye) {
		this.noEmploye = noEmploye;
	}
	//redéfinition de la méthode equals
	public boolean equals(Object obj) {
		Employe e;
		if (obj ==null || obj.getClass()!=this.getClass())
		 {
		 return false;
		 }
		 else
		 {
			 e=(Employe)obj;
			 if (e.getNom().equals(getNom())& e.getPrenom()==(getPrenom()) &e.getMatricule()==getMatricule() &e.getNoEmploye()==getNoEmploye() )
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
		return this.getNom().hashCode()+this.getPrenom().hashCode()+(int)this.getMatricule()+(int)this.getNoEmploye();
	}
	//redéfinition de la méthode toString
    public String toString() {
    	return "NOM: "+getNom()+"; Prenom: "+getPrenom()+"; Matricule: "+getMatricule()+"; NoEmploye: "+getNoEmploye();
    }


}
