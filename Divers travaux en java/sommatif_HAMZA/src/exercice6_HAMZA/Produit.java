package exercice6_HAMZA;


public class Produit {
	
	private String nom;
	private int prix;
	private int ref;
	private String description;
	private int quantite;
	
	public Produit() {
		super();
	}
	public Produit(String nom, int prix, int ref, String description, int quantite) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.ref = ref;
		this.description = description;
		this.quantite = quantite;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	//redéfinition de la méthode equals
	public boolean equals(Object obj) {
		Produit p;
		if (obj ==null || obj.getClass()!=this.getClass())
		 {
		 return false;
		 }
		 else
		 {
			 p=(Produit)obj;
			 if (p.getNom().equals(getNom())& p.getPrix()==(getPrix()) &p.getDescription().equals(getDescription()) &p.getRef()== getRef() )
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
		public int hashCode()
		{
		return this.getNom().hashCode()+this.getDescription().hashCode()+(int)this.getPrix()+(int)this.getQuantite()+(int)this.getRef();
	
		}
		//redéfinition de la méthode toString(pour l'affichage)
	    public String toString() {
	    	return "NOM: "+getNom()+"; Description: "+getDescription()+"; Prix: "+getPrix()+"; Quantité: "+getQuantite()+"; Reference: "+getRef();
	    }


	
	
}
