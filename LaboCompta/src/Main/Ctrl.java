package Main;

import java.lang.Object;


public class Ctrl {

	public Ctrl(Object string) {
		// TODO Auto-generated constructor stub
	}

	public boolean isValid(String str){
		boolean ok = true;
		
		if (!(str.length() < 6 ))
				ok = false;

		for (int i = 0; i<str.length() && ok; i++){
			if (!Character.isDigit(str.charAt(i)))			
				ok = false;
			      
		}

		return ok;
	}
	
}
