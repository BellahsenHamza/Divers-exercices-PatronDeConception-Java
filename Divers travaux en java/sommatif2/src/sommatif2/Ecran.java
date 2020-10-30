package sommatif2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;

public class Ecran extends JFrame{

	JPanel panoBoutons; 
	JPanel panoTxt; 
	JPanel panoLbl;
	JLabel lblNom,lblPrenom,lblNo;
	JMenuItem mtmAdd,mtmFind,mtmDelete;
	JButton btnAdd,btnFind,btnDelete,btnAfficher;
	JTextField txtNom,txtPrenom,txtNo;
	ListeGenerique<etudiant> listeEtudiant=new ListeGenerique<etudiant>(20);
	public Ecran() {
		setTitle("Sommatif2_HAMZA");
		setResizable(false);
		setSize( 700, 450);
		Ecouteur ec;
		ec=new Ecouteur();
		/**********************************************Les boutons*****************************/
		//Création des boutons 
		btnAdd=new JButton("Ajouter");
		btnFind=new JButton("Rechercher par No");
		btnDelete=new JButton("Supprimer par No");
		btnAfficher=new JButton("Afficher");
		
		//Ajout des écouteurs d'action	
		btnAdd.addActionListener(ec);
		btnAdd.setActionCommand("add");
		btnFind.addActionListener(ec);
		btnFind.setActionCommand("find");
		btnDelete.addActionListener(ec);
		btnDelete.setActionCommand("delete");
		btnAfficher.addActionListener(ec);
		btnAfficher.setActionCommand("show");
		/**********************************************Le menu*****************************/

		//Création du menu
		JMenuBar barreMenu; 
        barreMenu=new JMenuBar(); 
        JMenu mnuActions; 
        mnuActions=new JMenu("Actions"); 
        barreMenu.add(mnuActions); 
        mtmAdd=new JMenuItem("Ajouter");
        mtmAdd.setActionCommand("add");
        mtmFind=new JMenuItem("Rechercher par No");
        mtmFind.setActionCommand("find");
        mtmDelete=new JMenuItem("Supprimer par No");
        mtmDelete.setActionCommand("delete");
        mnuActions.add(mtmAdd);
        mnuActions.add(mtmFind);
        mnuActions.add(mtmDelete);
        
        //Ajout des écouteurs d'actions
        mtmAdd.addActionListener(ec);
        mtmDelete.addActionListener(ec);
        mtmFind.addActionListener(ec);
        setJMenuBar(barreMenu); 
        
        //Placement des boutons dans leur conteneur 
        panoBoutons=new JPanel();
        panoBoutons.setLayout(new BoxLayout(panoBoutons, BoxLayout.PAGE_AXIS));
        panoBoutons.add(Box.createVerticalStrut(20)); 
        panoBoutons.add(btnAdd);
        panoBoutons.add(Box.createVerticalStrut(20)); 
        panoBoutons.add(btnFind);
        panoBoutons.add(Box.createVerticalStrut(20)); 
        panoBoutons.add(btnDelete); 
        panoBoutons.add(Box.createVerticalStrut(20)); 
        panoBoutons.add(btnAfficher);
        //Placement des zones de texte dans leur conteneur
        panoTxt=new JPanel();
        panoTxt.setLayout(null);
        txtNom=new JTextField();
        txtPrenom=new JTextField();
        txtNo=new JTextField();       
        txtNom.setBounds(80,20,150,20);
        txtPrenom.setBounds(80,55,150,20);
        txtNo.setBounds(80,90,150,20);
        panoTxt.add(txtNom); 
        panoTxt.add(txtPrenom);
        panoTxt.add(txtNo);
        
        //Placement des labels dans leur conteneur
        panoLbl=new JPanel();
        panoLbl.setLayout(new BoxLayout(panoLbl, BoxLayout.PAGE_AXIS));
        lblNom=new JLabel("Nom");
        lblPrenom=new JLabel("Prénom");
        lblNo=new JLabel("No d'étudiant");     
        panoLbl.add(Box.createVerticalStrut(20)); 
        panoLbl.add(lblNom);
        panoLbl.add(Box.createVerticalStrut(20)); 
        panoLbl.add(lblPrenom);
        panoLbl.add(Box.createVerticalStrut(20)); 
        panoLbl.add(lblNo);
        
        //Ajout des panel dans la fenetre
        getContentPane().add(panoBoutons,BorderLayout.NORTH); 
        getContentPane().add(panoBoutons,BorderLayout.EAST); 
        getContentPane().add(panoTxt,BorderLayout.CENTER); 
        getContentPane().add(panoLbl,BorderLayout.WEST);
      
        //Fermeture de la fenetre
        addWindowListener(new WindowAdapter() 
        { 
             public void windowClosing(WindowEvent arg0) 
             { 
                  System.exit(0); 
             } 
        } 
        ); 

         
	}
	//classe imbriquée qui implémente ActionListener
	public class Ecouteur implements ActionListener 
	{ 
		etudiant e; 
	      public void actionPerformed(ActionEvent arg0) 
	      { 
	    	   		   
	            String commande; 
	            commande=arg0.getActionCommand(); 
	            //Méthode appelée lors de l'ajout
	            if(commande.equals("add")){
	            	try {
	            	 e=new etudiant(Integer.parseInt(txtNo.getText()), txtNom.getText(), txtPrenom.getText());	
	            	txtNo.setText("");
	            	txtNom.setText("");
	            	txtPrenom.setText("");
	            	if(listeEtudiant.comparer(e)==true)
	            		JOptionPane.showMessageDialog(null, "Un étudiant ayant ce numéro existe déjà dans la liste", "ERREUR", JOptionPane.ERROR_MESSAGE);
	            	else {
	            	listeEtudiant.ajout(e);	 
	            	}
	            	}
	            	catch(Exception l) {
	            		JOptionPane.showMessageDialog(null, "Entrez des valeurs valide", "ERREUR", JOptionPane.ERROR_MESSAGE);
	            		txtNo.setText("");
		            	txtNom.setText("");
		            	txtPrenom.setText("");
	            	}
	            	
	            }
	            
	            //Méthode appelée lors de la suppression
	            if(commande.equals("delete")){
	            	try {
	            	listeEtudiant.supprime(Integer.parseInt(txtNo.getText()));
	            	}
	            	catch(Exception m) {
	            		JOptionPane.showMessageDialog(null, "Entrez une valeur valide", "ERREUR", JOptionPane.ERROR_MESSAGE);
	            	}
	            	txtNo.setText("");
	            }
	            
	            //Méthode appelée lors de la recherche
	            if(commande.equals("find")) {
	            	try {
	            	listeEtudiant.rechercher(Integer.parseInt(txtNo.getText()));
	            	}
	            	catch(Exception ex) {
	            		JOptionPane.showMessageDialog(null, "Entrez une valeur valide", "ERREUR", JOptionPane.ERROR_MESSAGE);
	            	}
	            	txtNo.setText("");
	            }
	           
	            //Méthode appelée lors de l'affichage
	            if(commande.equals("show")){
	           
	            	listeEtudiant.afficher();

	            }

	            
                            /************TOUT S'AFFICHE DANS LA CONSOLE************/
	      } 
	      
	}
	
}



