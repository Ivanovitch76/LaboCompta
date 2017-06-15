package Main;

public class DispatchMenu {

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

}
