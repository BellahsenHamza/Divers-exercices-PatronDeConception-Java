package exercice6_HAMZA;

public class Principale {

	public static void main(String[] args) {
		
//cr�ation des listes pour chaque type d'objets		
ListeGenerique<Produit> lstProduits=new ListeGenerique<>(10);
ListeGenerique<Employe> lstEmploye=new ListeGenerique<>(10);
ListeGenerique<Elevage> lstElevage=new ListeGenerique<>(10);

//cr�ation de produits
Nourriture fourrage=new Nourriture("foin", 10, 1, "herbe de foin", 20);
Entretien Anti_insecte=new Entretien("Shampoing", 12, 2, "Shampoing anti-insectes", 30);
Ferrure sabot=new Ferrure("Sabot", 30, 3, "Sabot de fer pour chevaux", 200);
Equipement selle=new Equipement("Selle",40,4,"Selle en cuir",100);

//cr�ation Employ�s
Employe employe1=new Employe("Bellahsen", "Hamza", 1011, 11);
Employe employe2=new Employe("toto", "toto", 1012, 12);
Employe employe3=new Employe("Alonso", "Sergio", 1013, 13);
Employe employe4=new Employe("Hakim", "Ziyech", 1014, 14);

//cr�ation de chevaux d'�levage
PSang cheval1=new PSang(1, "Spirit", 450);
PSang cheval2=new PSang(2, "Cristal", 380);
PRace cheval3=new PRace(3, "Fort", 500);
PRace cheval4=new PRace(4, "Merveil", 360);
System.out.println("------------------AJOUT---------------");
//Ajouter les produits dans la liste
lstProduits.ajout(fourrage);
lstProduits.ajout(Anti_insecte);
lstProduits.ajout(sabot);
lstProduits.ajout(selle);
lstProduits.afficher();

//Ajouter les employ�s dans la liste
lstEmploye.ajout(employe1);
lstEmploye.ajout(employe2);
lstEmploye.ajout(employe3);
lstEmploye.ajout(employe4);
Employe employe25=new Employe("Hakim", "Ziyech", 1014, 14);
lstEmploye.ajout(employe25);
lstEmploye.afficher();

//Ajouter les chevaux d'�levage
lstElevage.ajout(cheval1);
lstElevage.ajout(cheval2);
lstElevage.ajout(cheval3);
lstElevage.ajout(cheval4);
lstElevage.afficher();
System.out.println("------------Ajout d'�l�ment existant------------------");
Nourriture fourrage2=new Nourriture("foin", 10, 1, "herbe de foin", 20);
lstProduits.ajout_sansDoublons(fourrage2);
lstProduits.afficher();
Employe employe10=new Employe("Bellahsen", "Hamza", 1011, 11);
lstEmploye.ajout_sansDoublons(employe10);
lstEmploye.afficher();
PSang cheval8=new PSang(1, "Spirit", 450);
lstElevage.ajout_sansDoublons(cheval8);
lstElevage.afficher();

System.out.println("------------------SUPPRESSION---------------");
//supprimer produit a l'index 3
lstProduits.supprime(3);
lstProduits.afficher();
//supprimer employe a l'index 2
lstEmploye.supprime(2);
lstProduits.afficher();

//supprimer cheval a l'index 1
lstElevage.supprime(1);
lstElevage.afficher();

System.out.println("------------------Remplacement---------------");
//remplacer un produit
Equipement etrier=new Equipement("�trier", 15, 50, "�trier de bonne qualit�", 50);
lstProduits.remplacer(etrier, 2);
lstProduits.afficher();

//remplacer un employe
Employe employe5=new Employe("Diego", "L�o", 1014, 14);
lstEmploye.remplacer(employe5, 1);
lstEmploye.afficher();

System.out.println("Affichage nb de chevaux d'�levage");
//remplacer un cheval
PSang cheval5=new PSang(5, "CHVL", 400);
lstElevage.remplacer(cheval5, 2);
lstElevage.afficher();
PSang cheval6=new PSang(5, "CHVL", 400);
lstElevage.ajout(cheval6);
System.out.println("----------------Supprimer les doublons-----------------------");
System.out.println("avant");
Employe employe20=new Employe("Hakim", "Ziyech", 1014, 14);
Employe employe14=new Employe("Bellahsen", "Hamza", 1011, 11);
lstEmploye.ajout(employe14);
lstEmploye.ajout(employe20);
lstEmploye.afficher();
System.out.println("apr�s");
lstEmploye.supprimerSemblable(employe1);
lstEmploye.supprimerSemblable(employe20);
lstEmploye.afficher();



}
	

}
