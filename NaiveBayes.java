/***************************************************************************************************
This class uses the data collected to calculate the probability of the user having COVID


Author: Jade Brennan-Keane
Student Number: C18512336
***************************************************************************************************/

import java.util.HashMap;
import java.util.Scanner;
import java.io.File;

public class NaiveBayes {
	/*************************************V A R I A B L E S**************************************/
	File data;
	Scanner scan;
	float total;
	float negRes;
	float posRes;
	int count;
	/*************************************V A R I A B L E S**************************************/
	
	/**************************************N E G A T I V E***************************************/
	/**************************************H A S H M A P S***************************************/
	HashMap<String, Integer> tempNeg = new HashMap<>();
	HashMap<Boolean, Integer> soreNeg = new HashMap<>();
	HashMap<Boolean, Integer> coughingNeg = new HashMap<>();
	HashMap<Boolean, Integer> soreThroatNeg = new HashMap<>();
	HashMap<Boolean, Integer> dangerTravelNeg = new HashMap<>();
	/**************************************N E G A T I V E***************************************/
	/**************************************H A S H M A P S***************************************/
	
	/**************************************P O S I T I V E***************************************/
	/**************************************H A S H M A P S***************************************/
	HashMap<String, Integer> tempPos = new HashMap<>();
	HashMap<Boolean, Integer> sorePos = new HashMap<>();
	HashMap<Boolean, Integer> coughingPos = new HashMap<>();
	HashMap<Boolean, Integer> soreThroatPos = new HashMap<>();
	HashMap<Boolean, Integer> dangerTravelPos = new HashMap<>();
	/**************************************P O S I T I V E***************************************/
	/**************************************H A S H M A P S***************************************/
	
	/***************************************C O V I D 1 9****************************************/
	/***************************************H A S H M A P****************************************/
	HashMap<Boolean, Integer> covid19 = new HashMap<>();
	/***************************************C O V I D 1 9****************************************/
	/***************************************H A S H M A P****************************************/
	
	
	public float Probability() {
		//positive multiply
		total = covid19.get(true);
		posRes = tempPos.get(choice.getTemp()) / total;
		posRes *= sorePos.get(choice.getSore()) / total;
		posRes *= coughingPos.get(choice.getCoughing()) / total;
		posRes *= soreThroatPos.get(choice.getThroatSore()) / total;
		posRes *= dangerTravelPos.get(choice.getDangerTravel()) / total;
		posRes *= (float) covid19.get(true) / count;
		
		//negative multiply
		total = covid19.get(false);
		negRes = tempNeg.get(getTemp()) / total;
		negRes *= soreNeg.get(getSore()) / total;
		negRes *= coughingNeg.get(getCoughing()) / total;
		negRes *= soreThroatNeg.get(getThroatSore()) / total;
		negRes *= dangerTravelNeg.get(getDangerTravel()) / total;
		negRes *= (float) covid19.get(false) / count;
		
		//probability return
		return posRes / (posRes+negRes) * 100;
	}
	
	/***********************************H A S H M A P K E Y S************************************/
	/*public void HashMapsKeys() {
		tempNeg.put(hot, 0);
		tempNeg.put(normal, 0);
		tempNeg.put(cool, 0);
		tempNeg.put(cold, 0);
		
		soreNeg.put(1, 0);
		soreNeg.put(0, 0);
		
		coughingNeg.put(1, 0);
		coughingNeg.put(0, 0);
		
		soreThroatNeg.put(1, 0);
		soreThroatNeg.put(0, 0);
		
		dangerTravelNeg.put(1, 0);
		dangerTravelNeg.put(0, 0);
	}*/
	/***********************************H A S H M A P K E Y S************************************/
}