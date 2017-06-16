package compteGeneral;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class ListeCompteGen {
	Object listComptes = new HashMap();

	public static boolean addCompte(String num, String libel,char pos,boolean sub){
		String numero = num;
		String libelle = libel;
		char posi = pos;
		boolean subd = sub;
		System.out.println("num�ro: " + numero);
		System.out.println("libell�: " + libelle);
		System.out.println("position: " + posi);
		System.out.println("sub: " + subd);
		
		return false;
	}
	public void load() {
		try {
			FileInputStream fichier = new FileInputStream("compte.txt");
			ObjectInputStream ois = new ObjectInputStream(fichier);
			this.listComptes =  (Object) ois.readObject();
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
