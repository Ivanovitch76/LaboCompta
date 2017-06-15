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
		System.out.print("Le num�ro de compte doit-il �tre subdivisable?  ");
		rep1 = sc.nextLine();
		if (!ctrl.isValidSub(rep1)){
			System.out.println("Veuillez entrer une r�ponse valide (oui/non)");
			getScreenDebut();
		} else {
			getScreenNum();
		}
		
	}
	
	private void getScreenNum(){
        String rep2 = new String(); 
        String rep3 = new String(); 
		System.out.print("Introduisez un num�ro de compte g�n�ral : ");
		rep2 = sc.nextLine();
		if (!ctrl.isValidNum(rep1, rep2)){
			System.out.print("Mauvais num�ro. Voulez-vous en entrer un nouveau?  ");
			rep3 = sc.nextLine();
			if (rep3.equalsIgnoreCase("oui"))
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
			System.out.println("Libell� incoh�rent, veuillez mettre au moins un caract�re alphanum�rique");	
			System.out.print("Voulez-vous entrer un nouveau nom pour le compte?  ");
			rep = sc.nextLine();
			if (rep.equalsIgnoreCase("oui"))
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
		System.out.println("Veuillez entrer une r�ponse valide (oui/non)");
		if (!ctrl.isValidSub(valid)){
			valid = sc.nextLine();
			getScreenRepValide();
		}
		
		
	}

}