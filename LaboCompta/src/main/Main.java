package main;

public class Main {

	public static void main(String[] args) {
		User ui = new User();
		ActionsDB db = new ActionsDB();
//		Vue vue = new Vue();

		
		db.load();
		ui.startproc();
//		vue.getScreenDebut();
//		System.out.println(vue.getScreenDebut());

	}

}
