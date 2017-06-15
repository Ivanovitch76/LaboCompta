package Main;

import compteGeneral.VueCG;
import compteParticulier.VueCP;

public class DispatchMenu {
	VueCG vueCG = new VueCG();
	VueCP vueCP = new VueCP();
	

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
				vueCG.getScreenDebut();	
				break;
			default:
				vueCG.getScreenDebut();	
			}
			break;
		case "2":
			switch (rep2){
			case "1":
				vueCP.getScreenDebut();	
				break;
			default:
				vueCP.getScreenDebut();	
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
