package som3;

import java.util.ArrayList;
import java.util.Iterator;

public class Avion<T extends Voyageur> {

	private int NbElements;
	private int nbPlaceTotal=500;
	public int getNbElements() {
		return NbElements;
	}
	public int getNbPlaceTotal() {
		return nbPlaceTotal;
	}
	//j'utilise une arraylist car les m�thodes � faire sont assez simple, ce qui convient. Je n'ai pas besoin de faire des unions de listes ou de trier des �l�ments, par exemple
	ArrayList<T> lst;
	public Avion() {
		lst = new ArrayList<T>(nbPlaceTotal);
	}
	//m�thode pour comparer si deux voyageurs ont les m�mes informations(pour �viter les doublons)
	public boolean comparer(Voyageur e) {	
		boolean b=false;
		for(T element:lst) {
			if(element.equals(e)) {
				b= true;
			}		
			else {
				b=false;
			}
		}
		return b;
		
	}
	//m�thode pour voir si une place est prise
	public boolean comp(int n) {
		boolean b=false;
		for(T element:lst) {
			if(element.getNo_place()==n ) {
				b=true;
				break;			
			}
			else
				b=false;
			}
		
		return b;

		
	}
	//m�thode pour voir si le num�ro de place d�passe le nombre de places total
	public boolean numplace(int i) {
		if(i>nbPlaceTotal)
			return false;
		else
			return true;
	}
	//m�thode pour ajouter un voyageur
	public void ajouter(T element) {
		if(comparer(element)==false &&element.getNo_place()!=0) {
			lst.add(element);
		    NbElements++;	
		}

	}
	//m�thode qui affiche la liste de voyageurs
	public void AfficherInfo() {		
		Iterator<T> it;
		it=lst.iterator();
		T element;
		System.out.println("Liste des voyageurs");
		while(it.hasNext()) {
			element=it.next();
				System.out.println(element.toString());
		}
}
//m�thode qui retourne le num�ro de place d'un voyageur
	public void getVoyageur(int n) {
		for(T element:lst) {
			if(n==element.getNo_passeport()) {
				if(element.getNo_place()==0) {
					System.out.println("Ce voyageur n'occupe aucune place");
				}
				else {
				System.out.println("Ce voyageur occupe la place "+element.getNo_place());
				break;
				}
			}
		}

	}
	//m�thode qui permet d'attribuer une place � un voyageur si elle est libre
	public void AttributionPlace(T element,int place) {	
		if(numplace(place)==false) {
			System.out.println("Cette place d�passe le nombre de places total");
		}
		else {
		if(comp(place)==true) {
			System.out.println("La place est prise");
		}
		else {
				element.setNo_place(place);
				ajouter(element);
		}	
		}
		}
	//m�thode qui permet de lib�rer une place prise
	public void LibererPlace(int place) {
		if(comp(place)==false) {
			System.out.println("Cette place est libre");
		}
		for(T element:lst) {
			if(element.getNo_place()==place) {
				System.out.println("Informations concernant ce voyageur: "+element.toString());
				lst.remove(element);
				break;
			}
			
		}
		

		
	}
	
}
