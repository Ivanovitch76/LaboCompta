package compteGeneral;

import java.lang.Object;


public class CtrlCG {

	public CtrlCG(Object string) {
		// TODO Auto-generated constructor stub
	}

	public boolean isValidSub(String rep1) {
		boolean subOK = true;
		if (!(rep1.equalsIgnoreCase("oui") ||
			  rep1.equalsIgnoreCase("non")))	
			subOK = false;
		return subOK;
	}
	
	public boolean isValidNum(String rep1, String rep2){
		boolean numOK = true;

		if (rep1.equalsIgnoreCase("oui")){

			if ((!(rep2.length() < 6 )))				
				numOK = false;
	
		} else {	
		if (rep1.equalsIgnoreCase("non")){		

			if (rep2.length() < 6 || rep2.length() > 6)			
				numOK = false;

		} 
		}
		for (int i = 0; i<rep2.length() && numOK; i++){
			if (!Character.isDigit(rep2.charAt(i)))			
				numOK = false;

		}
		return numOK;
	}

	public boolean isValidLibel(String libel) {
		boolean libOK = true;
//        String temp = "";
		int count = 0;
		if (libel.trim().equals("")){
			libOK = false;
		}

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
