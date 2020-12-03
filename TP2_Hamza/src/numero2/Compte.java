package numero2;

import java.util.ArrayList;

public abstract class Compte {

	
	protected abstract CartePaiement creerCarte();
	
	public CartePaiement nouveauCompte() {
		CartePaiement c=this.creerCarte();
		System.out.println(c.infosCarte());
		return c;
	}
}
