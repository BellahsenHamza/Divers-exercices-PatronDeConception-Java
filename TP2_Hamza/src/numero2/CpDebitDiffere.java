package numero2;

import java.text.DecimalFormat;

public class CpDebitDiffere extends CartePaiement {

	public CpDebitDiffere() {
		super();
		tauxInteret=0.009;
	}
	public String infosCarte() {
		System.out.println("Cr�ation d'un compte platinium. Vous recevez une carte � d�bit diff�r�");
		DecimalFormat df=new DecimalFormat();
		df.setMaximumFractionDigits(2);
		return "Taux d'int�r�t de votre nouvelle carte: "+(df.format(getTauxInteret()*100))+"%";
	}
}
