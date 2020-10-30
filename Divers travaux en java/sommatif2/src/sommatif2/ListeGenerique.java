package sommatif2;

import java.util.ArrayList;

public class ListeGenerique<T extends etudiant> {
	private ArrayList<T> liste=new ArrayList<T>();
	private int nbElements;
	
	public ListeGenerique(int taille) {
		taille=nbElements;
		liste=new ArrayList<T>(taille);
	}
	
	//méthode pour vérifier si l'élément existe déjà dans la liste
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

	//Méthode permettant d'ajouter un étudiant à la liste
	public void ajout(T element)
	 {
		 if(comparer(element)==false) {
		liste.add(element);
		nbElements = nbElements + 1;
		System.out.println("Étudiant ajouté");

		}
	 } 
	
	//Méthode permettant de supprimer un étudiant de la liste
	public void supprime(int i)
	 {
	
	 for(T element: liste) {
		 if(element.getNoEtudiant()==i) {
			 liste.remove(element);
			 nbElements--;
			 System.out.println("Étudiant supprimé");
			 break;
		 }
		  
	 }
	 
	 
	 } 
	
	//Méthode permettant de rechercher un étudiant dans la liste et de retourner ses informations
	public void rechercher(int i) {
		
		for(T element:liste) {
			if(element.getNoEtudiant()==i){
				System.out.println("Voici les informations concernant cet étudiant");
				System.out.println(element.toString());
			}
			else {
				System.out.println("Introuvable");
			}
		}
	}
	
	//Méthode permettant d'afficher la liste d'étudiants
	public void afficher() {
		
		if(liste.size()==0) {
			System.out.println("La liste est vide");
		}
		else {
			
			System.out.println("Liste d'étudiants");
		for(T element:liste) {
			System.out.println(element.toString());
		}
		}


		
	}
}
