package menu;

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

	public static boolean isValidSM(String rep1, String rep2) {
		boolean smOK = true;
		switch(rep1){
			case "1":
			case "2":
				if (!(rep2.equals("1") ||
					  rep2.equals("2") ||	
				      rep2.equals("3") ||
					  rep2.equals("4"))){ 
						smOK = false;		
					}			
				break;
			case "3":	
				if (!(rep2.equals("1") ||
					  rep2.equals("2") ||	
					  rep2.equals("3"))){ 	
						smOK = false;		
						}				
		}
		return smOK;
		
	}

}
