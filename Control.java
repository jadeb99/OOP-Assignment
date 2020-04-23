/************************************************************************************************************
This is a program to check the likelyhood of you having COVID-19 based on the symtoms you are showing

This class is simply the control and will start the events that will be in the other classes

Author: Jade Brennan-Keane
Student Number: C18512336
***********************************************************************************************************/

public class Control{
	public static void main(String[]args){
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
 
			public void run() {
 
				Display display = new Display(); 
 
			}
 
		});
	}
}