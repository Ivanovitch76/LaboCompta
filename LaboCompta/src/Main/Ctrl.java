package Main;

import java.lang.Object;


public class Ctrl {

	public Ctrl(Object string) {
		// TODO Auto-generated constructor stub
	}

	public boolean isValid(String rep1, String rep2){
		boolean ok = true;

		switch(rep1){
		case "oui":
		case "Oui":
		case "OUI":	
			if ((!(rep2.length() < 6 )))				
				ok = false;
			break;	

		case "non":
		case "Non":
		case "NON":	
			if (rep2.length() < 6 || rep2.length() > 6)			
				ok = false;
			break;   
		default:
			ok = false;
		}	
		for (int i = 0; i<rep2.length() && ok; i++){
			if (!Character.isDigit(rep2.charAt(i)))			
				ok = false;

		}
		return ok;
	}

}
