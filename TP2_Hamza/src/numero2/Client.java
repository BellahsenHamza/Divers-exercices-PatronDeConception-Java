package numero2;

public class Client {

	public static void main(String[] args) {

		Compte compte;
		
		compte=new ComptePlatinum();
		compte.nouveauCompte();
		
		System.out.println();
		
		compte=new CompteStandard();
		compte.nouveauCompte();
		
		System.out.println();
		
		compte=new ComptePrestige();
		compte.nouveauCompte();
	}

}
