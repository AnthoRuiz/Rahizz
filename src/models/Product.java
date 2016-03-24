package models;

public class Product {
	
	private String codRef;
	private String costPrice;
	private String sellPrice;
	private String description;
	private String dateAdd;
	private int count;
	
	public Product(){
		this.codRef = "";
		this.costPrice = "";
		this.sellPrice = "";
		this.description = "";
		this.dateAdd = "";
		this.count = 0;
	}
	
	public Product(String codRef, String costPrice, String sellPrice, String description, String dateAdd, int count){
		this.codRef = codRef;
		this.costPrice = costPrice;
		this.sellPrice = sellPrice;
		this.description = description;
		this.dateAdd = dateAdd;
		this.count = count;
		
	}

	public void print(){
		System.out.println(this.codRef + " " + this.costPrice + " " + this.sellPrice + " " + this.description + " " + this.dateAdd + " " + this.count);
	}
	
	public String getCodRef() {
		return codRef;
	}

	public void setCodRef(String codRef) {
		this.codRef = codRef;
	}

	public String getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(String costPrice) {
		this.costPrice = costPrice;
	}

	public String getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(String sellPrice) {
		this.sellPrice = sellPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDateAdd() {
		return dateAdd;
	}

	public void setDateAdd(String dateAdd) {
		this.dateAdd = dateAdd;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
