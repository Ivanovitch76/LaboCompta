package main;

import java.util.Scanner;

import compteGeneral.CtrlCG;
import compteGeneral.VueCG;
import menu.CtrlMenu;
import menu.DispatchMenu;
import menu.VueMenu;
import java.util.HashMap;
import java.util.Map;

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
			validChoix();
		} else {	
			System.out.println("Votre choix ne fait pas partie de la liste. Veuillez choisir un autre numéro");	
			subMenuProc();
		}
	}

	private void validChoix() {
		String valid = new String();	

		valid = scan.nextLine();
		while (!CtrlCG.isValidSub(valid)){
			System.out.print("Veuillez entrer une réponse valide (oui/non)   ");
			valid = scan.nextLine();
		saveChoix();	
		}

		
	}

	private void saveChoix() {
		Map<Numero, Data> ListComptes = new HashMap<>();
		Numero numero = new Numero(VueCG.getRecapitulatif());
		
	}
	
	
}
