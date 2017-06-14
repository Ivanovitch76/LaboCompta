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
		
//		cgBuild.append(String.format("Le numéro de compte doit-il être subdivisable?"));
//		cgBuild.append(System.lineSeparator());
//		cgBuild.append(str = sc.nextLine());
	
//		return cgBuild.toString();
		
		System.out.println("Le numéro de compte doit-il être subdivisable?");
		str = sc.nextLine();
		System.out.println("Introduisez un numéro de compte général : ");
		str = sc.nextLine();
		System.out.println("Le numéro de compte est valable");		
		
		
	}
	


}
