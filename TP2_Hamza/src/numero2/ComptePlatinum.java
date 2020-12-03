package numero2;

public class ComptePlatinum extends Compte{

	protected CartePaiement creerCarte() {
		return new CpDebitDiffere();
	}
}
