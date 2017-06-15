package Main;

import java.util.Scanner;

public class User {

	private String id;
	VueMenu vueM = new VueMenu();
	Scanner scan = new Scanner(System.in);
	DispatchMenu dM = new DispatchMenu();
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
			subMenuProc();
		} else {
			System.out.println("Votre choix ne fait pas partie de la liste. Veuillez choisir un numéro entre 1 et 5");
			startproc();
		}

		
	}

	private void subMenuProc() {
		String rep2 = new String();
		
		dM.getFirstChoice(rep1);
		System.out.print(dM.getFirstChoice(rep1));
		rep2 = scan.nextLine();		
		CtrlMenu.isValidSM(rep1, rep2);
		if (CtrlMenu.isValid(rep2)){
			dM.getSecondChoice(rep1, rep2);
		} else {	
			System.out.println("Votre choix ne fait pas partie de la liste. Veuillez choisir un autre numéro");	
			subMenuProc();
		}
	}

	
}
