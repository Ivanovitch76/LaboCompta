package compteGeneral;

import java.io.Serializable;

public class CompteGeneral implements Serializable{

	private String num;
	private String libel;
	private String pos;

	public CompteGeneral(String num, String libel, String pos) {
		this.num =num;
		this.libel = libel;
		this.pos = pos;
	}

	public String getNum() {
		return num;
	}

	public String getLibel() {
		return libel;
	}

	public String getPos() {
		return pos;
	}

}
