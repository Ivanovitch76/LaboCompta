package Main;

import java.lang.Object;
import java.util.ArrayList;


public class Ctrl {

	public Ctrl(Object string) {
		// TODO Auto-generated constructor stub
	}

	public boolean isValidNum(String rep1, String rep2){
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

	public boolean isValidLibel(String libel) {
		boolean libOK = true;
		int count = 0;
		for (int i = 0; i<libel.length(); i++){
			if (Character.isDigit(libel.charAt(i)))			
				count++;
			if (Character.isAlphabetic(libel.charAt(i)))			
				count++;		
	
		}		
		if (count == 0)
			libOK = false;
		return libOK;
	}

	public boolean isValidPos(String pos) {
		boolean posOK = true;
		if (!(pos.equalsIgnoreCase("A") ||
		    pos.equalsIgnoreCase("B") ||
		    pos.equalsIgnoreCase("C") ||
		    pos.equalsIgnoreCase("D"))){
			posOK = false;
		}
		return posOK;
		
	}

}
