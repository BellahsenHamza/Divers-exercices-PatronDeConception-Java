package numero2;

public class ComptePrestige extends Compte {

	protected ComposantPrestige prestige=new ComposantPrestige();
	
	protected CartePaiement creerCarte() {
		System.out.println("Création d'un compte prestige");
		System.out.println("Vos avantages");
		prestige.Conseiller();
		prestige.decouvert();
		prestige.Invitation();
		prestige.Pshopper();
		prestige.tauxInteret();
		return new CpDebitDiffere();
	}

}
