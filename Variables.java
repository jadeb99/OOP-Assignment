/*************************************************************************************************
This class allows the user to enter the data into the program

Author: Jade Brennan-Keane
Student Number: C18512336
**************************************************************************************************/

public class Variables {
	/*************************************V A R I A B L E S**************************************/
	private String temp;
	private String sore;
	private String coughing;
	private String throatSore;
	private String dangerTravel;
	private String contracted;
	/*************************************V A R I A B L E S**************************************/
	
	/**********************************C O N S T R U C T O R S***********************************/
	public Variables(String temp, String sore, String coughing, String throatSore, String dangerTravel) {
		setTemp(temp);
		setSore(sore);
		setCoughing(coughing);
		setThroatSore(throatSore);
		setDangerTravel(dangerTravel);
	}
	
	public Variables(String temp, String sore, String coughing, String throatSore, String dangerTravel, String contracted) {
		setTemp(temp);
		setSore(sore);
		setCoughing(coughing);
		setThroatSore(throatSore);
		setDangerTravel(dangerTravel);
		setContracted(contracted);
	}
	/**********************************C O N S T R U C T O R S***********************************/
	
	/**************************************T O S T R I N G***************************************/
	public String toString() {
		return "Temp: "+getTemp()+"\nSore: "+getSore()+"\nCoughing: "+getCoughing()+"\nSore throat: "+getThroatSore()+"\nDanger Traveling: "+getDangerTravel()+"\nHas contracted covid 19: ";
	}
	/**************************************T O S T R I N G***************************************/
	
	/***************************************G E T T E R S****************************************/
	/*******************************************A N D********************************************/
	/***************************************S E T T E R S****************************************/
	//temp
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	
	//sore
	public String getSore() {
		return sore;
	}
	public void setSore(String sore) {
		this.sore = sore;
		
	}
	
	//coughing
	public String getCoughing() {
		return coughing;
	}
	public void setCoughing(String coughing) {
		this.coughing = coughing;
	}
	
	//throatSore
	public String getThroatSore() {
		return throatSore;
	}
	public void setThroatSore(String throatSore) {
		this.throatSore = throatSore;
	}
	
	//dangerTravel
	public String getDangerTravel() {
		return dangerTravel;
	}
	public void setDangerTravel(String dangerTravel) {
		this.dangerTravel = dangerTravel;
	}
	
	//contracted
	public String getContracted() {
		return contracted;
	}
	public void setContracted(String contracted) {
		this.contracted = contracted;
	}
	/***************************************G E T T E R S****************************************/
	/*******************************************A N D********************************************/
	/***************************************S E T T E R S****************************************/
}