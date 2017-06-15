package Main;

import java.util.Scanner;

public class Vue {
	
	private User ui;
	Scanner sc = new Scanner(System.in);
    Object String = null;
	Ctrl ctrl = new Ctrl(String);

	public Vue() {
		this.ui = null;
	}
	
	public void getScreenDebut(){
		StringBuilder cgBuild = new StringBuilder() ;
        String rep1 = new String();
        String rep2 = new String(); 
        String rep3 = new String();  
		
/*		cgBuild.append(String.format("Le num�ro de compte doit-il �tre subdivisable?"));
		cgBuild.append(System.lineSeparator());
		cgBuild.append(String.format("Introduisez un num�ro de compte g�n�ral : "));
		cgBuild.append(str = sc.nextLine());
		cgBuild.append(System.lineSeparator());		
		cgBuild.append(String.format("Le num�ro de compte est valable"));		
	
 		return cgBuild.toString();
*/		
		System.out.println("Le num�ro de compte doit-il �tre subdivisable?");
		rep1 = sc.nextLine();
		System.out.println("Introduisez un num�ro de compte g�n�ral : ");
		rep2 = sc.nextLine();
		if (!ctrl.isValidNum(rep1, rep2)){
			System.out.println("Mauvais num�ro. Voulez-vous en entrer un nouveau?");
			rep3 = sc.nextLine();
			if (rep3.equalsIgnoreCase("oui"))
				getScreenDebut();		
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
		} else {
			getScreenPosition();
		}
		
	}

	private void getScreenPosition() {
        String pos = new String(); 
        
		System.out.println("Indiquez la postion du compte au bilan : A, B, C ou D");
		pos = sc.nextLine();
		if(!ctrl.isValidPos(pos)){
			System.out.println("Position inexistante au bilan");		
			getScreenPosition();
		}
	}
	


}
