package compteGeneral;

import java.util.Scanner;

import Main.User;

public class VueCG {
	
	private User ui;
	Scanner sc = new Scanner(System.in);
    Object StringV = null;
    static String rep1 = new String();
    static String rep2 = new String(); 
    static String libel = new String(); 
    static String pos = new String(); 
	CtrlCG ctrl = new CtrlCG(StringV);
	String valid = new String(); 
	static StringBuilder recapBuild = new StringBuilder();

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

        String rep3 = new String(); 
		System.out.print("Introduisez un num�ro de compte g�n�ral : ");
		rep2 = sc.nextLine();
		if (!ctrl.isValidNum(rep1, rep2)){
			System.out.print("Mauvais num�ro. Voulez-vous en entrer un nouveau?  ");
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

        String rep = new String(); 
        
		System.out.print("Introduisez un nom pour le compte : ");
		libel = sc.nextLine();
		if (!ctrl.isValidLibel(libel)){
			System.out.print("Libell� incoh�rent, veuillez mettre au moins un caract�re alphanum�rique");	
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
        
		System.out.print("Indiquez la postion du compte au bilan : A, B, C ou D   ");
		pos = sc.nextLine();
		if(!ctrl.isValidPos(pos)){
			System.out.println("Position inexistante au bilan");		
			getScreenPosition();
		} else {
			getRecapitulatif();
			System.out.println(recapBuild);
		}
	}
	
	private void getScreenRepValide() {
		if (!ctrl.isValidSub(valid)){
			System.out.print("Veuillez entrer une r�ponse valide (oui/non)   ");
			valid = sc.nextLine();
			getScreenRepValide();			
		} 
		
		
	}

	public static String getRecapitulatif() {

		recapBuild.append(System.lineSeparator());	
		recapBuild.append(System.lineSeparator());	
		recapBuild.append(String.format("-----------------------------------------------"));
		recapBuild.append(System.lineSeparator());	
		recapBuild.append(String.format("R�capitulatif de vos choix:"));
		recapBuild.append(System.lineSeparator());
		recapBuild.append(String.format("---------------------------"));
		recapBuild.append(System.lineSeparator());
		recapBuild.append(String.format("Num�ro de compte g�n�ral: " + rep2));
		recapBuild.append(System.lineSeparator());
		recapBuild.append(String.format("Subdivisable: " + rep1));
		recapBuild.append(System.lineSeparator());
		recapBuild.append(String.format("Nom du compte: " + libel));
		recapBuild.append(System.lineSeparator());
		recapBuild.append(String.format("Position au bilan: " + pos));
		recapBuild.append(System.lineSeparator());
		recapBuild.append(String.format("Validez-vous vos choix?"));
		
		return recapBuild.toString();
	}
	
	
}
