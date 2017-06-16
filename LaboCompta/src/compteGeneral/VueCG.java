package compteGeneral;

import java.util.Scanner;

import Main.User;

public class VueCG {
	
	private User ui;
	Scanner sc = new Scanner(System.in);
    Object String = null;
    String rep1 = new String();
	CtrlCG ctrl = new CtrlCG(String);
	String valid = new String(); 

	public VueCG() {
		this.ui = null;
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
//			getScreenLibel();	
			System.out.println("rep3: " + rep3 + "    " + valid);
			if (valid.equalsIgnoreCase("oui"))
				getScreenNum();		
	    } else {
	    	getScreenLibel();
	    }		
	}

	private void getScreenLibel() {
        String libel = new String(); 
        String rep = new String(); 
        
		System.out.println("Introduisez un nom pour le compte : ");
		libel = sc.nextLine();
		if (!ctrl.isValidLibel(libel)){
			System.out.println("Libellé incohérent, veuillez mettre au moins un caractère alphanumérique");	
			System.out.print("Voulez-vous entrer un nouveau nom pour le compte?  ");
			rep = sc.nextLine();
			valid = rep;
			getScreenRepValide();
//			getScreenLibel();			
			if (valid.equalsIgnoreCase("oui"))
				getScreenLibel();				
		} else {
			getScreenPosition();
		}
		
	}

	private void getScreenPosition() {
        String pos = new String(); 
        
		System.out.print("Indiquez la postion du compte au bilan : A, B, C ou D   ");
		pos = sc.nextLine();
		if(!ctrl.isValidPos(pos)){
			System.out.println("Position inexistante au bilan");		
			getScreenPosition();
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
