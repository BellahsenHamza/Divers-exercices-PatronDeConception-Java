package ex6;

public class Main {

	public static void main(String[] args) {
		Client client;
		client=new ClientOracle();
		
		client.nouvelleConnexion();
		client.nouvelleConnexion();
		
		System.out.println("Nombre de connexions dans la liste: "+client.connexions.size());

		Client client2;
		client2=new ClientSQL();
		
		client2.nouvelleConnexion();
		System.out.println("Nombre de connexions dans la liste: "+client2.connexions.size());

	}

}
