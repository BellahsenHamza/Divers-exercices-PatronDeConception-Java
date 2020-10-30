package sommatif2;

import java.util.ArrayList;

public class ListeGenerique<T extends etudiant> {
	private ArrayList<T> liste=new ArrayList<T>();
	private int nbElements;
	
	public ListeGenerique(int taille) {
		taille=nbElements;
		liste=new ArrayList<T>(taille);
	}
	
	//m�thode pour v�rifier si l'�l�ment existe d�j� dans la liste
	public boolean comparer(etudiant e) {	
		boolean b=false;
		for(T element:liste) {
			if(element.equals(e)) {
				b= true;
			}		
			else {
				b=false;
			}
		}
		return b;
		
	}

	//M�thode permettant d'ajouter un �tudiant � la liste
	public void ajout(T element)
	 {
		 if(comparer(element)==false) {
		liste.add(element);
		nbElements = nbElements + 1;
		System.out.println("�tudiant ajout�");

		}
	 } 
	
	//M�thode permettant de supprimer un �tudiant de la liste
	public void supprime(int i)
	 {
	
	 for(T element: liste) {
		 if(element.getNoEtudiant()==i) {
			 liste.remove(element);
			 nbElements--;
			 System.out.println("�tudiant supprim�");
			 break;
		 }
		  
	 }
	 
	 
	 } 
	
	//M�thode permettant de rechercher un �tudiant dans la liste et de retourner ses informations
	public void rechercher(int i) {
		
		for(T element:liste) {
			if(element.getNoEtudiant()==i){
				System.out.println("Voici les informations concernant cet �tudiant");
				System.out.println(element.toString());
			}
			else {
				System.out.println("Introuvable");
			}
		}
	}
	
	//M�thode permettant d'afficher la liste d'�tudiants
	public void afficher() {
		
		if(liste.size()==0) {
			System.out.println("La liste est vide");
		}
		else {
			
			System.out.println("Liste d'�tudiants");
		for(T element:liste) {
			System.out.println(element.toString());
		}
		}


		
	}
}
