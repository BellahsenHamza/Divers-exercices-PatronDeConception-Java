package numero2;


public abstract class CartePaiement {

	protected double tauxInteret;
	
	public double getTauxInteret() {
		return tauxInteret;
	}
	
	public abstract String infosCarte();
}
