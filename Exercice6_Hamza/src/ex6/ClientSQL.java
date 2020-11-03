package ex6;

public class ClientSQL extends Client{
	
	protected SGBD connecter() {
		return new MYSQL();
	}
}
