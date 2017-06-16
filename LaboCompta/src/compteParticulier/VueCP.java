package compteParticulier;

import java.util.Scanner;

public class VueCP {

	Scanner sc = new Scanner(System.in);
    Object String = null;
    String rep1 = new String();
	CtrlCP ctrl = new CtrlCP();
	String valid = new String(); 

	public VueCP() {
	}
	
	public void getScreenDebut(){
	
		System.out.print("Le numéro de compte doit-il être subdivisable?  ");
		rep1 = sc.nextLine();
		if (!ctrl.isValidSub(rep1)){
			System.out.println("Veuillez entrer une réponse valide (oui/non)");
			getScreenDebut();
		} else {
			getScreenNum();
		}
		
	}
	
	private void getScreenNum(){
        String rep2 = new String(); 
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
	    } else {
	    	getScreenLibel();
	    }	

	    }		



	private void getScreenLibel() {
        String libel = new String(); 
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

	
}
