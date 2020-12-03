package numero1;

import java.util.ArrayList;

public abstract class Sujet {
	protected ArrayList<Observateur> observateurs = new ArrayList<Observateur>(); 

	public void ajoute(Observateur observateur) { 
		observateurs.add(observateur); 
	} 

	public void retire(Observateur observateur) { 
		observateurs.remove(observateur); 
	} 

	public void notifie() { 
		for (Observateur observateur: observateurs) 
			observateur.actualise(); 
	} 

}
