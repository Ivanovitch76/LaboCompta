package Main;

public class User {

	private String id;
	Vue vue = new Vue();
	
	
	public void setId(String id) {
		this.id = id;
	}

	public String getId() {

		return id;
	}

	public void startproc() {
		vue.getScreenDebut();
		
	}


	
}
