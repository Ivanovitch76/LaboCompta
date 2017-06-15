package Main;

public class CtrlMenu {

	public static boolean isValid(String rep1) {
		boolean fcOK = true;
		if (!(rep1.equals("1") ||
			  rep1.equals("2") ||	
			  rep1.equals("3") ||
			  rep1.equals("4") ||
			  rep1.equals("5"))){
			fcOK = false;		
		}
		return fcOK;
		
	}

}
