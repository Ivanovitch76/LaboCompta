package menu;

import java.util.Scanner;

import compteGeneral.CtrlCG;
import compteGeneral.ListeCompteGen;
import compteGeneral.VueCG;
import compteParticulier.VueCP;

public class DispatchMenu {
	VueCG vueCG = new VueCG();
	VueCP vueCP = new VueCP();
	VueMenu vueM = new VueMenu();
	Scanner scan = new Scanner(System.in);
	String rep1 = new String();
	String valid = new String();
	char pos;
	boolean sub = false;
	
	
	
	public DispatchMenu(){
		ListeCompteGen lcg = new ListeCompteGen();
		lcg.load();
		vueCG.setListCompte(lcg);
	}

	public void startproc(){
		menuProc();
		subMenuProc();
		validChoix();
		if (valid.equals("oui")){
			vueCG.getAnswers();
		} 	
	}
	
	public void menuProc() {		
		vueM.getMenu();
		System.out.print(vueM.getMenu());
		rep1 = scan.nextLine();	
		CtrlMenu.isValid(rep1);
		if (!(CtrlMenu.isValid(rep1))){
			System.out.println("Votre choix ne fait pas partie de la liste. Veuillez choisir un numéro entre 1 et 5");
			startproc();
		}

		
	}

	public void subMenuProc() {
		String rep2 = new String();
		
		getFirstChoice(rep1);
		System.out.print(getFirstChoice(rep1));
		rep2 = scan.nextLine();		
		CtrlMenu.isValidSM(rep1, rep2);
		if (CtrlMenu.isValid(rep2)){
			getSecondChoice(rep1, rep2);
		} else {	
			System.out.println("Votre choix ne fait pas partie de la liste. Veuillez choisir un autre numéro");	
			subMenuProc();
		}
	}

	public void validChoix() {	

		valid = scan.nextLine();
		while (!CtrlCG.isValidSub(valid)){
			System.out.print("Veuillez entrer une réponse valide (oui/non)   ");
			valid = scan.nextLine();
		}

	}
	
	public String getFirstChoice(String rep) {
		String subMenu = new String();
		switch (rep){
		case "1":
			VueMenu.getMenuCG();
			subMenu = VueMenu.getMenuCG();
			break;
		case "2":
			VueMenu.getMenuCP();
			subMenu = VueMenu.getMenuCP();
			break;
		case "3":
			VueMenu.getMenuEC();
			subMenu = VueMenu.getMenuEC();
			break;
		case "4":
			VueMenu.getMenuCG();
			subMenu = VueMenu.getMenuCG();
			break;
		case "5":
			VueMenu.getMenuCG();
			subMenu = VueMenu.getMenuCG();
		}
		return subMenu;
	}

	public void getSecondChoice(String rep1, String rep2) {
		switch (rep1){
		case "1":
			switch (rep2){
			case "1":
				vueCG.getScreenOperation();	
				break;
			default:
				vueCG.getScreenOperation();	
			}
			break;
		case "2":
			switch (rep2){
			case "1":
				vueCP.getScreenOperation();	
				break;
			default:
				vueCP.getScreenOperation();	
			}			
			break;
		case "3":
			break;
		case "4":
			break;
		case "5":
		}
		
	}

}
