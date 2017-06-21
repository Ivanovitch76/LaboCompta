package compteGeneral;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Scanner;

import menu.DispatchMenu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class VueCG {
	
	Scanner sc = new Scanner(System.in);
    Object StringV = null;
    Object answers = new HashMap<>();
    static String rep1 = new String();
    static String rep2 = new String(); 
    static String libel = new String(); 
    static String pos = new String(); 
	CtrlCG ctrl = new CtrlCG(StringV);
	String valid = new String();
	private ListeCompteGen listeCompteGen; 
	static StringBuilder recapBuild = new StringBuilder();

	public VueCG() {
	}
	
	public void getScreenOperation() {
		getScreenDebut();
		getScreenNum();
		getScreenLibel();
		getScreenPosition();
		getRecapitulatif();
		System.out.print(recapBuild);
	}
	
	public void getScreenDebut(){
		System.out.print("Le numéro de compte doit-il être subdivisable?  ");
		rep1 = sc.nextLine();
		if (!ctrl.isValidSub(rep1)){
			System.out.println("Veuillez entrer une réponse valide (oui/non)");
			getScreenDebut();
		} 
	}
	
	private void getScreenNum(){

        String rep3 = new String(); 
		System.out.print("Introduisez un numéro de compte général : ");
		rep2 = sc.nextLine();
		if (!ctrl.isValidNum(rep1, rep2)){
			System.out.print("Mauvais numéro. Voulez-vous en entrer un nouveau?  ");
			rep3 = sc.nextLine();
			valid = rep3;
			getScreenRepValide();
			if (valid.equalsIgnoreCase("oui"))
				getScreenNum();		
	    } 	
	}

	private void getScreenLibel() {

        String rep = new String(); 
        
		System.out.print("Introduisez un nom pour le compte : ");
		libel = sc.nextLine();
		if (!ctrl.isValidLibel(libel)){
			System.out.println("Libellé incohérent, veuillez mettre au moins un caractère alphanumérique");	
			System.out.print("Voulez-vous entrer un nouveau nom pour le compte?  ");
			rep = sc.nextLine();
			valid = rep;
			getScreenRepValide();
//			getScreenLibel();			
			if (valid.equalsIgnoreCase("oui"))
				getScreenLibel();				
		} 
		
	}

	private void getScreenPosition() {
        
		System.out.print("Indiquez la postion du compte au bilan : A, B, C ou D   ");
		pos = sc.nextLine();
		pos = pos.toUpperCase();
		if(!ctrl.isValidPos(pos)){
			System.out.println("Position inexistante au bilan");		
			getScreenPosition();
		} 
	}
	
	private void getScreenRepValide() {
		if (!ctrl.isValidSub(valid)){
			System.out.print("Veuillez entrer une réponse valide (oui/non)   ");
			valid = sc.nextLine();
			getScreenRepValide();			
		} 
		
		
	}

	public  String getRecapitulatif() {

		recapBuild.append(System.lineSeparator());	
		recapBuild.append(System.lineSeparator());	
		recapBuild.append(String.format("-----------------------------------------------"));
		recapBuild.append(System.lineSeparator());	
		recapBuild.append(String.format("Récapitulatif de vos choix:"));
		recapBuild.append(System.lineSeparator());
		recapBuild.append(String.format("---------------------------"));
		recapBuild.append(System.lineSeparator());
		recapBuild.append(String.format("Numéro de compte général: " + rep2));
		recapBuild.append(System.lineSeparator());
		recapBuild.append(String.format("Subdivisable: " + rep1));
		recapBuild.append(System.lineSeparator());
		recapBuild.append(String.format("Nom du compte: " + libel));
		recapBuild.append(System.lineSeparator());
		recapBuild.append(String.format("Position au bilan: " + pos));
		recapBuild.append(System.lineSeparator());
		recapBuild.append(String.format("Validez-vous vos choix?   "));
		
		return recapBuild.toString();

		
	}


	public boolean getAnswers() {
		boolean addOK = false;
		boolean sub = false;
		if (rep1.equalsIgnoreCase("oui")){
			sub = true;
		}
		System.out.println("getAnwers -- > addCompte");
		this.listeCompteGen.addCompte(rep2, libel, pos, sub);
		System.out.println("add OK getAnswers: " + this.listeCompteGen.addCompte(rep2, libel, pos, sub));
		addOK = this.listeCompteGen.addCompte(rep2, libel, pos, sub);
		return addOK;
		
	}

	public void setListCompte(ListeCompteGen lcg) {
		this.listeCompteGen = lcg;
	}

	public void getSorry() {
		DispatchMenu dM = new DispatchMenu();
		System.out.println("Ce numéro existe déjà. Voulez-vous recommencer avec un nouveau numéro?");
		valid = sc.nextLine();
		getScreenRepValide();
		if (valid.equalsIgnoreCase("oui"))
			dM.startproc();	 
			
	}
	
	
	
}
