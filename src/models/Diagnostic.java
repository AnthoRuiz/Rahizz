package models;

public class Diagnostic {
	private String stylistName;
	private String tecMixing;
	private String hairStructure;
	private String whiteHair;
	private String naturalTone;
	private String wantedTone;
	private String tecApp;
	private String postPaint;
	
	public Diagnostic(){
		this.stylistName = "";
		this.tecMixing = "";
		this.hairStructure = "";
		this.whiteHair = "";
		this.naturalTone = "";
		this.wantedTone = "";
		this.tecApp = "";
		this.postPaint = "";
	}

	public String getStylistName() {
		return stylistName;
	}

	public void setStylistName(String stylistName) {
		this.stylistName = stylistName;
	}

	public String getTecMixing() {
		return tecMixing;
	}

	public void setTecMixing(String tecMixing) {
		this.tecMixing = tecMixing;
	}

	public String getHairStructure() {
		return hairStructure;
	}

	public void setHairStructure(String hairStructure) {
		this.hairStructure = hairStructure;
	}

	public String getWhiteHair() {
		return whiteHair;
	}

	public void setWhiteHair(String whiteHair) {
		this.whiteHair = whiteHair;
	}

	public String getNaturalTone() {
		return naturalTone;
	}

	public void setNaturalTone(String naturalTone) {
		this.naturalTone = naturalTone;
	}

	public String getWantedTone() {
		return wantedTone;
	}

	public void setWantedTone(String wantedTone) {
		this.wantedTone = wantedTone;
	}

	public String getTecApp() {
		return tecApp;
	}

	public void setTecApp(String tecApp) {
		this.tecApp = tecApp;
	}

	public String getPostPaint() {
		return postPaint;
	}

	public void setPostPaint(String postPaint) {
		this.postPaint = postPaint;
	}
	
	public void print(){
		System.out.println(	this.stylistName + " " + this.tecMixing + " " + this.hairStructure + " " + this.whiteHair + " " + this.naturalTone + " " + this.wantedTone
				+ " "+ this.tecApp + " " + this.postPaint);
	}

}
