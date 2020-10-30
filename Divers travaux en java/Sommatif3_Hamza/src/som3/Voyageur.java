package som3;


public class Voyageur {

	private String nom;
	private int no_passeport;
	private int no_place;
	
	//constructeur de l'objet voyageur
	public Voyageur(String nom, int no_passeport) {
		super();
		this.nom = nom;
		this.no_passeport = no_passeport;
	}
	public int getNo_place() {
		return no_place;
	}
	public void setNo_place(int no_place) {
		this.no_place = no_place;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNo_passeport() {
		return no_passeport;
	}
	public void setNo_passeport(int no_passeport) {
		this.no_passeport = no_passeport;
	}
	//redéfinition HASHCODE
		public int hashCode() {
			return (int)this.getNo_passeport()+(int)this.getNo_place();
		}

		//redéfinition  equals
		public boolean equals(Object obj) {
			Voyageur v;
			if (obj ==null || obj.getClass()!=this.getClass())
			 {
			 return false;
			 }
			 else
			 {
				 v=(Voyageur)obj;
				 if ((v.getNo_passeport()==(getNo_passeport())&&(v.getNo_place()==getNo_place()) )||v.getNo_place()==getNo_place())
				 {
				 return true;
				 }
				 else
				 {
				 return false;
				 }
			 }
		}
		//redéfinition toString (Pour l'affichage)
		public String toString() {
			return  "Nom: "+getNom()+" | No de passeport: "+getNo_passeport()+" | No de place: "+getNo_place();
		}

}
