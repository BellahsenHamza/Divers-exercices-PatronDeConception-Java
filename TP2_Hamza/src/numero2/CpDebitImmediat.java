package numero2;

import java.text.DecimalFormat;

public class CpDebitImmediat extends CartePaiement {

	public CpDebitImmediat() {
		super();
		tauxInteret=0.02;
	}
	public String infosCarte() {
		System.out.println("Création d'un compte standard. Vous recevez une carte à débit immédiat");
		DecimalFormat df=new DecimalFormat();
		df.setMaximumFractionDigits(2);
		return "Taux d'intérêt de votre nouvelle carte: "+(df.format(getTauxInteret()*100))+"%";
	}

}
