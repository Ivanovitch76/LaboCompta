package Main;

import java.util.Scanner;

public class Vue {
	
	private User ui;

	public Vue() {
		this.ui = null;
	}
	
	public void getScreenDebut(){
		StringBuilder cgBuild = new StringBuilder() ;
		Scanner sc = new Scanner(System.in);
        String rep1 = new String();
        String rep2 = new String();        
        Object String = null;
		Ctrl ctrl = new Ctrl(String);
		
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
//		System.out.println(ctrl.isValid(str));
		System.out.println(ctrl.isValid(rep1, rep2) ? "Le num�ro de compte est valable" : "Mauvais num�ro");

		
		
	}
	


}
