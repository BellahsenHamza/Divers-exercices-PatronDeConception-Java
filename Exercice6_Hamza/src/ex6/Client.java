package ex6;

import java.util.ArrayList;

public abstract class Client {

	protected ArrayList<SGBD> connexions = new ArrayList<>(); 
	
	protected abstract SGBD connecter();
	
	public void nouvelleConnexion() {
		SGBD sgbd=this.connecter();
		sgbd.connexion();
		connexions.add(sgbd);
	}
	
}
