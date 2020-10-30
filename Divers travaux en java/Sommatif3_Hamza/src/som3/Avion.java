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
	//j'utilise une arraylist car les méthodes à faire sont assez simple, ce qui convient. Je n'ai pas besoin de faire des unions de listes ou de trier des éléments, par exemple
	ArrayList<T> lst;
	public Avion() {
		lst = new ArrayList<T>(nbPlaceTotal);
	}
	//méthode pour comparer si deux voyageurs ont les mêmes informations(pour éviter les doublons)
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
	//méthode pour voir si une place est prise
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
	//méthode pour voir si le numéro de place dépasse le nombre de places total
	public boolean numplace(int i) {
		if(i>nbPlaceTotal)
			return false;
		else
			return true;
	}
	//méthode pour ajouter un voyageur
	public void ajouter(T element) {
		if(comparer(element)==false &&element.getNo_place()!=0) {
			lst.add(element);
		    NbElements++;	
		}

	}
	//méthode qui affiche la liste de voyageurs
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
//méthode qui retourne le numéro de place d'un voyageur
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
	//méthode qui permet d'attribuer une place à un voyageur si elle est libre
	public void AttributionPlace(T element,int place) {	
		if(numplace(place)==false) {
			System.out.println("Cette place dépasse le nombre de places total");
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
	//méthode qui permet de libérer une place prise
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
