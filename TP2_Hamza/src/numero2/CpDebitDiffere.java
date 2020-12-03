package numero2;

import java.text.DecimalFormat;

public class CpDebitDiffere extends CartePaiement {

	public CpDebitDiffere() {
		super();
		tauxInteret=0.009;
	}
	public String infosCarte() {
		System.out.println("Création d'un compte platinium. Vous recevez une carte à débit différé");
		DecimalFormat df=new DecimalFormat();
		df.setMaximumFractionDigits(2);
		return "Taux d'intérêt de votre nouvelle carte: "+(df.format(getTauxInteret()*100))+"%";
	}
}
