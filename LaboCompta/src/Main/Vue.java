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
        String str = new String();
		
//		cgBuild.append(String.format("Le num�ro de compte doit-il �tre subdivisable?"));
//		cgBuild.append(System.lineSeparator());
//		cgBuild.append(str = sc.nextLine());
	
//		return cgBuild.toString();
		
		System.out.println("Le num�ro de compte doit-il �tre subdivisable?");
		str = sc.nextLine();
		System.out.println("Introduisez un num�ro de compte g�n�ral : ");
		str = sc.nextLine();
		System.out.println("Le num�ro de compte est valable");		
		
		
	}
	


}
