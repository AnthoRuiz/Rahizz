package models;

public class Employe {
	
	private String document;
	private String name;
	private String pass;
	private String role;
	
	public Employe(){
		this.document = "";
		this.name = "";
		this.pass = "";
		this.role = "";
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
