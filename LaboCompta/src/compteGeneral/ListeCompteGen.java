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
		//ListeCompteGen lCG = new ListeCompteGen();
		//this.listComptes = new HashMap<String, CompteGeneral>();
		CompteGeneral cg;
		// TODO test
		cg = new CompteGeneralSubdivisable(num, libel,pos);
		
		this.listComptes.put(num, cg);
		this.save();
		return false;
	}
	public void load() {
		try {
			FileInputStream fichier = new FileInputStream("compte.txt");
			ObjectInputStream ois = new ObjectInputStream(fichier);
			this.listComptes =  (HashMap<String, CompteGeneral>) ois.readObject();
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
