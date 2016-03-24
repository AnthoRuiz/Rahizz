package models;

import javax.swing.text.Document;

public class Customer {
	private String document;
	private String name;
	private String cel;
	private String date;
	private String gender;
	private String email;
	private String pagoCxC;
	
	public Customer(){
		this.document = "";
		this.name = "";
		this.cel = "";
		this.date = "";
		this.gender = "";
		this.email = "";
		this.pagoCxC = "";
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

	public String getCel() {
		return cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPagoCxC() {
		return pagoCxC;
	}

	public void setPagoCxC(String pagoCxC) {
		this.pagoCxC = pagoCxC;
	}
	
	public void print(){
		System.out.println(this.document + " " + this.name + " "+ this.cel + " "+ this.date + " "+ this.gender + " "+this.email + " "+this.pagoCxC);
	}

}
