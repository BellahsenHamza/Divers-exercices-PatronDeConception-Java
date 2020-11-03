package ex6;

public class ClientOracle extends Client {

	protected SGBD connecter() {
		return new Oracle();
	}
}
