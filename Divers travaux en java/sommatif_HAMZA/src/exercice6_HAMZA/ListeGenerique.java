package exercice6_HAMZA;

import java.util.ArrayList;


public class ListeGenerique<T> {

	private ArrayList<T> liste=new ArrayList<T>();
	private int nbElements;
	
	public ListeGenerique(int taille) {
		liste=new ArrayList<T>(taille);
	}
	//cette methode compare un objet aux éléments d'une liste
	public boolean comparer(Object o) {	
		boolean b=false;
		for(T element:liste) {
			if(element.equals(o)) {
				b= true;
				break;
			}		
			else {
				b=false;
			}
		}
		return b;
		
	}
	public void ajout(T element)
	 {

		liste.add(element);
		nbElements = nbElements + 1;

	 } 
	//méthode ajouter qui permet d'ajouter un element dans une liste seulement s'il n'existe pas deja
	//elle fait appel a la méthode comparer
	public void ajout_sansDoublons(T element)
	 {
		if (comparer(element)==true){
			System.out.println("il existe deja dans la liste");
		}
		else if(comparer(element)==false) {
		liste.add(element);
		nbElements = nbElements + 1;

		}
	 } 
	public void supprime(int index)
	 {
	 if (index >= nbElements || index < 0)
	 {
	 return;
	 }
	 liste.remove(index); 
	 nbElements = nbElements - 1;
	 } 
	//méthode permettant de supprimer les doublons
	public void supprimerSemblable(T element) {
		int b=liste.indexOf(element);
		for(int i=0;i<liste.size();i++) {
			if(element.equals(liste.get(i))==true && i!=b) {
				supprime(i);
				i--;
				b--;
			}

		}
	}
	public int obtenirNB( ) {
		return nbElements;
	}
	public void remplacer(T element, int pos) {
		supprime(pos);
		if (comparer(element)==true){
			System.out.println("il existe deja dans la liste");
		}
		else if(comparer(element)==false) {
			liste.add(pos, element);
			nbElements=nbElements+1;
		}
	}
	//méthode pour afficher les éléments de la liste
	public void afficher() {
		for(T element:liste) {
			System.out.println(element.toString());
		}
		System.out.println("________________________________________________________________");
	}



}
