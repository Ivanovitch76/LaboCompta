package compteParticulier;

import java.util.Scanner;

import compteGeneral.ListeCompteG;

public class VueCP {

	Scanner sc = new Scanner(System.in);
    static String rep1 = new String();
    static String rep2 = new String(); 
    static String libel = new String();    
	CtrlCP ctrl = new CtrlCP();
	String valid = new String(); 
	private ListeCompteG listeCompteG; 
	static StringBuilder recapBuild = new StringBuilder();

	public VueCP() {
	}
	
	public void getScreenOperation() {
		getScreenDebut();
		getScreenNum();
		getScreenLibel();
		getRecapitulatif();
		System.out.println(recapBuild);
	}
	
	public void getScreenDebut(){
	
		System.out.print("Le numéro de compte doit-il être subdivisable?  ");
		rep1 = sc.nextLine();
		if (!ctrl.isValidSub(rep1)){
			System.out.println("Veuillez entrer une réponse valide (oui/non)");
			getScreenDebut();
		} 		
	}
	
	private void getScreenNum(){
        String rep3 = new String(); 
		System.out.print("Introduisez un numéro de compte général : ");
		rep2 = sc.nextLine();
		if (!ctrl.isValidNum(rep1, rep2)){
			System.out.print("Mauvais numéro. Voulez-vous en entrer un nouveau?  ");
			rep3 = sc.nextLine();
			valid = rep3;	
			getScreenRepValide();
			if (valid.equalsIgnoreCase("oui"))
				getScreenNum();
	    } 
	}		



	private void getScreenLibel() {
        String rep = new String(); 
        
		System.out.print("Introduisez un nom pour le compte : ");
		libel = sc.nextLine();
		if (!ctrl.isValidLibel(libel)){
			System.out.println("Libellé incohérent, veuillez mettre au moins un caractère alphanumérique");	
			System.out.print("Voulez-vous entrer un nouveau nom pour le compte?  ");
			rep = sc.nextLine();
			valid = rep;
			getScreenRepValide();			
			if (valid.equalsIgnoreCase("oui"))
				getScreenLibel();	
		}
	}
	
	private void getScreenRepValide() {
		if (!ctrl.isValidSub(valid)){
			System.out.print("Veuillez entrer une réponse valide (oui/non)   ");
			valid = sc.nextLine();
			getScreenRepValide();
		}
		
		
	}

		public  String getRecapitulatif() {

		recapBuild.append(System.lineSeparator());	
		recapBuild.append(System.lineSeparator());	
		recapBuild.append(String.format("-----------------------------------------------"));
		recapBuild.append(System.lineSeparator());	
		recapBuild.append(String.format("Récapitulatif de vos choix:"));
		recapBuild.append(System.lineSeparator());
		recapBuild.append(String.format("---------------------------"));
		recapBuild.append(System.lineSeparator());
		recapBuild.append(String.format("Numéro de compte général: " + rep2));
		recapBuild.append(System.lineSeparator());
		recapBuild.append(String.format("Subdivisable: " + rep1));
		recapBuild.append(System.lineSeparator());
		recapBuild.append(String.format("Nom du compte: " + libel));
		recapBuild.append(System.lineSeparator());
		recapBuild.append(String.format("Validez-vous vos choix?"));
		
		return recapBuild.toString();

		
	}
}
