package compteParticulier;

import java.util.Scanner;

public class VueCP {

	Scanner sc = new Scanner(System.in);
    Object String = null;
    String rep1 = new String();
	CtrlCP ctrl = new CtrlCP();

	public VueCP() {
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
		System.out.println("Introduisez un num�ro de compte g�n�ral : ");
		rep2 = sc.nextLine();
		if (!ctrl.isValidNum(rep1, rep2)){
			System.out.println("Mauvais num�ro. Voulez-vous en entrer un nouveau?");
			rep3 = sc.nextLine();
			if (!ctrl.isValidSub(rep3)){
				System.out.println("Veuillez entrer une r�ponse valide (oui/non)");
				getScreenNum();
			} else {	
				if (rep3.equalsIgnoreCase("oui"))
					getScreenNum();
			}	
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
			System.out.println("Voulez-vous entrer un nouveau nom pour le compte?");
			rep = sc.nextLine();
			if (rep.equalsIgnoreCase("oui"))
				getScreenLibel();				
		} 
		
	}

	
}
