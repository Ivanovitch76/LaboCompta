package compteGeneral;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class ListeCompteGen {
	private HashMap<String, CompteGeneral> listComptes = new HashMap<>();

	public  boolean addCompte(String num, String libel,String pos,boolean sub){
		isValidNum(num);
		CompteGeneral cg;
		if (sub){
			cg = new CompteGeneralSubdivisable(num, libel,pos);			
		} else {
			cg = new CompteGeneralNonSubdivisable(num, libel,pos);	
		}
		this.listComptes.put(num, cg);
		System.out.println("num: " + num + " cg: " + cg);
		this.save();
		return false;
	}
	private void isValidNum(String num) {
		// TODO Auto-generated method stub
		
	}
	public void load() {
		try {
			FileInputStream fichier = new FileInputStream("compte.txt");
			ObjectInputStream ois = new ObjectInputStream(fichier);
			this.listComptes =  (HashMap<String, CompteGeneral>) ois.readObject();
			System.out.println("comptes: " + this.listComptes);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public void save(){
		try {
			FileOutputStream fichier = new FileOutputStream("compte.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fichier);
			oos.writeObject(this.listComptes);
			oos.flush();
			oos.close();
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}		
	}
	
}
