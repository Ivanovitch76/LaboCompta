package Main;

import java.util.Scanner;

public class User {

	private String id;
	Vue vue = new Vue();
	VueMenu vueM = new VueMenu();
	Scanner scan = new Scanner(System.in);
	String rep1 = new String();
	
	
	public void setId(String id) {
		this.id = id;
	}

	public String getId() {

		return id;
	}

	public void startproc() {
		vueM.getMenu();
		System.out.print(vueM.getMenu());
		rep1 = scan.nextLine();	
		CtrlMenu.isValid(rep1);
		if (CtrlMenu.isValid(rep1)){
			DispatchMenu.getFirstChoice(rep1);
			System.out.print(vueM.getMenuCG());
			rep1 = scan.nextLine();				
		} else {
			System.out.println("Votre choix ne fait pas partie de la liste. Veuillez choisir un numéro entre 1 et 5");
			startproc();
		}

		
	}


	
}
