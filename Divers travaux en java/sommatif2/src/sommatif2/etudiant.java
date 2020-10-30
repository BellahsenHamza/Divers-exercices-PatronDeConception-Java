package sommatif2;

public class etudiant {

	private int noEtudiant;
	private String nom,prenom;
	
	public etudiant(int noEtudiant, String nom, String prenom) {
		super();
		this.noEtudiant = noEtudiant;
		this.nom = nom;
		this.prenom = prenom;
	}
	public int getNoEtudiant() {
		return noEtudiant;
	}
	public void setNoEtudiant(int noEtudiant) {
		this.noEtudiant = noEtudiant;
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
	
	//red�finition HASHCODE
	public int hashCode() {
		return (int)this.getNoEtudiant()+this.getNom().hashCode()+this.getPrenom().hashCode();
	}

	//red�finition  equals
	public boolean equals(Object obj) {
		etudiant e;
		if (obj ==null || obj.getClass()!=this.getClass())
		 {
		 return false;
		 }
		 else
		 {
			 e=(etudiant)obj;
			 if (e.getNoEtudiant()==(getNoEtudiant()) )
			 {
			 return true;
			 }
			 else
			 {
			 return false;
			 }
		 }
	}
	
	//red�finition toString (Pour l'affichage)
	public String toString() {
		return "No d'�tudiant: "+getNoEtudiant()+" | Nom: "+getNom()+" | Pr�nom: "+getPrenom();
	}
	
}
