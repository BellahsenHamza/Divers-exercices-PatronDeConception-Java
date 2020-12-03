package numero2;

public class CompteStandard extends Compte {
	
	protected CartePaiement creerCarte() {
		return new CpDebitImmediat();
	}
}
