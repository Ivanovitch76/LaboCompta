package Main;

public class DispatchMenu {

	public static void getFirstChoice(String rep) {
		switch (rep){
		case "1":
			VueMenu.getMenuCG();
			break;
		case "2":
			VueMenu.getMenuCP();
			break;
		case "3":
			VueMenu.getMenuEC();
			break;
		case "4":
			VueMenu.getMenuCG();
			break;
		case "5":
			VueMenu.getMenuCG();		
		}
		
	}

}
