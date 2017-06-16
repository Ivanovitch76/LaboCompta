package menu;

import compteGeneral.ListeCompteGen;

public class VueMenu {

	public static String getMenu() {

		StringBuilder menuBuild;
		menuBuild = new StringBuilder();
			
		menuBuild.append(String.format("Faites votre choix parmi les options suivantes:"));
		menuBuild.append(System.lineSeparator());
		menuBuild.append(String.format("-----------------------------------------------"));
		menuBuild.append(System.lineSeparator());
		menuBuild.append(System.lineSeparator());
		menuBuild.append(String.format("1. Compte g�n�ral"));
		menuBuild.append(System.lineSeparator());		
		menuBuild.append(String.format("2. Compte particulier"));
		menuBuild.append(System.lineSeparator());
		menuBuild.append(String.format("3. Ecriture comptable"));
		menuBuild.append(System.lineSeparator());
		menuBuild.append(String.format("4. Afficher toutes les op�rations d'un compte"));
		menuBuild.append(System.lineSeparator());
		menuBuild.append(String.format("5. Afficher le bilan"));	
		menuBuild.append(System.lineSeparator());
		menuBuild.append(System.lineSeparator());
		menuBuild.append(String.format("Votre r�ponse : "));	
										
		return menuBuild.toString();
	}

	public static String getMenuCG() {
		StringBuilder menuCGBuild;
		menuCGBuild = new StringBuilder();
			
		menuCGBuild.append(String.format("Faites votre choix parmi les options suivantes:"));
		menuCGBuild.append(System.lineSeparator());
		menuCGBuild.append(String.format("-----------------------------------------------"));
		menuCGBuild.append(System.lineSeparator());
		menuCGBuild.append(System.lineSeparator());
		menuCGBuild.append(String.format("1. Cr�er un compte g�n�ral"));
		menuCGBuild.append(System.lineSeparator());		
		menuCGBuild.append(String.format("2. Modifier un compte g�n�ral"));
		menuCGBuild.append(System.lineSeparator());
		menuCGBuild.append(String.format("3. Supprimer un compte g�n�ral"));
		menuCGBuild.append(System.lineSeparator());
		menuCGBuild.append(String.format("4. Afficher la liste des comptes g�n�raux"));	
		menuCGBuild.append(System.lineSeparator());
		menuCGBuild.append(System.lineSeparator());
		menuCGBuild.append(String.format("Votre r�ponse : "));	

										
		return menuCGBuild.toString();
		
	}

	public static String getMenuCP() {
		StringBuilder menuCGBuild;
		menuCGBuild = new StringBuilder();
			
		menuCGBuild.append(String.format("Faites votre choix parmi les options suivantes:"));
		menuCGBuild.append(System.lineSeparator());
		menuCGBuild.append(String.format("-----------------------------------------------"));
		menuCGBuild.append(System.lineSeparator());
		menuCGBuild.append(System.lineSeparator());
		menuCGBuild.append(String.format("1. Cr�er un compte particulier"));
		menuCGBuild.append(System.lineSeparator());		
		menuCGBuild.append(String.format("2. Modifier un compte particulier"));
		menuCGBuild.append(System.lineSeparator());
		menuCGBuild.append(String.format("3. Supprimer un compte particulier"));
		menuCGBuild.append(System.lineSeparator());
		menuCGBuild.append(String.format("4. Afficher la liste des comptes particuliers"));	
		menuCGBuild.append(System.lineSeparator());
		menuCGBuild.append(System.lineSeparator());
		menuCGBuild.append(String.format("Votre r�ponse : "));	
										
		return menuCGBuild.toString();
		
	}

	public static String getMenuEC() {
		StringBuilder menuECBuild;
		menuECBuild = new StringBuilder();
			
		menuECBuild.append(String.format("Faites votre choix parmi les options suivantes:"));
		menuECBuild.append(System.lineSeparator());
		menuECBuild.append(String.format("-----------------------------------------------"));
		menuECBuild.append(System.lineSeparator());
		menuECBuild.append(System.lineSeparator());
		menuECBuild.append(String.format("1. Cr�er une �criture comptable"));
		menuECBuild.append(System.lineSeparator());		
		menuECBuild.append(String.format("2. Modifier une �criture comptable"));
		menuECBuild.append(System.lineSeparator());
		menuECBuild.append(String.format("3. Supprimer une �criture comptable"));
		menuECBuild.append(System.lineSeparator());
		menuECBuild.append(System.lineSeparator());
		menuECBuild.append(String.format("Votre r�ponse : "));	
										
		return menuECBuild.toString();
		
	}

	
}
