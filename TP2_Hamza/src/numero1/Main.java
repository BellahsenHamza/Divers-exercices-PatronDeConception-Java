package numero1;

public class Main {

	public static void main(String[] args) {
		
		//Les trois états possibles
		Etat etudiant=new Etudiant();
		Etat actif=new Actif();
		Etat retraite=new Retraite();
		
		System.out.println("Vie étudiante");
		Personne personne=new Personne("Hamza", 0);
		VuePersonne vuePersonne=new VuePersonne(personne);
		vuePersonne.redessine();
		personne.ajoutePoints(20);
		
		System.out.println("");
		System.out.println("Vie Active");
		personne.changeEtat();
		personne.ajoutePoints(10);
		personne.ajoutePoints(22);
		
		System.out.println("");
		System.out.println("La retraite");
		personne.changeEtat();
		personne.ajoutePoints(20);
	}

}
