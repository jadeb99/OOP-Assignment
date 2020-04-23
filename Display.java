/*********************************************************************************************************
This class creates the GUI that will be shown to the user.

It also creates drop down boxes for the user to enter their data and retrieves the data from them.


Author: Jade Brennan-Keane
Student Number: C18512336
*********************************************************************************************************/

/*My compiler wouldnt allow me to use the * to add all of these at once
*/
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.BoxLayout;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.SwingConstants;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

import java.io.File;


public class Display extends JFrame implements ActionListener {
	/*************************************V A R I A B L E S**************************************/
	JLabel heading, tempLabel, soreLabel, coughingingLabel, throatSoreLabel, dangerTravelLabel;
	JButton confirmChoices, clearChoices, selectFile;
	JPanel norPan, souPan, cenPan;
	JPanel tempPanel, sorePanel, coughingingPanel, throatSorePanel, dangerTravelPanel;
	File data;
	JFileChooser ChooseFile;
	JComboBox temp, sore, coughing, throatSore, dangerTravel;
	/*************************************V A R I A B L E S**************************************/
	
	public Display(){
		
		// Make the window
        final JFrame frame = new JFrame("COVID-19 Test");
		
		//making labels for the GUI
        heading = new JLabel ("Covid-19 test");
		tempLabel = new JLabel("What is your temperature?");
		soreLabel = new JLabel("Are you sore?");
		coughingingLabel = new JLabel("Are you coughinging?");
		throatSoreLabel = new JLabel("Do you have a sore throat?");
		dangerTravelLabel = new JLabel("Have you travelled to a danger zone recently?");
		
		//maing the file chooser
		ChooseFile = new JFileChooser();
		
		//button to activate adding the file
		selectFile = new JButton("Please Select a File");
		//selecting the file
		selectFile.addActionListener( new ActionListener()
		{ 
			public void actionPerformed(ActionEvent e)
			{ 
				ChooseFile.showOpenDialog(ChooseFile);
				data = ChooseFile.getSelectedFile();
				SelectFile File = new SelectFile(data);
			}
		});
		
		//button to submit your choices
		confirmChoices = new JButton("Submit Choices");
		confirmChoices.addActionListener(this);
		
		//drop down list for temp
		String boxTemp[] = {"hot", "normal", "cool", "cold"};
		temp = new JComboBox(boxTemp);
		String StTemp = (String)temp.getSelectedItem();
		
		//drop down list for sore
		String boxsore[] = {"yes", "no"};
		sore = new JComboBox(boxsore);
		String StSore = (String)sore.getSelectedItem();
		
		//drop down list for coughing
		String boxcoughing[] = {"yes", "no"};
		coughing = new JComboBox(boxcoughing);
		String StCoughing = (String)coughing.getSelectedItem();
		
		//drop down list for ThroatSore
		String boxthroatSore[] = {"yes", "no"};
		throatSore= new JComboBox(boxthroatSore);
		String StThroatSore = (String)throatSore.getSelectedItem();
		
		//drop down list for dangerTravel
		String boxdangerTravel[] = {"yes","no"};
		dangerTravel = new JComboBox(boxdangerTravel);
		String StDangerTravel = (String)dangerTravel.getSelectedItem();
		
		//Creating choices object to hold the users choices
		Variables choice = new Variables(StTemp, StSore, StCoughing, StThroatSore, StDangerTravel);
		
		/***************************************P A N E L S****************************************/
		norPan = new JPanel();
		souPan = new JPanel();
		cenPan = new JPanel();
		
		tempPanel = new JPanel();
		sorePanel = new JPanel();
		coughingingPanel = new JPanel();
		throatSorePanel = new JPanel();
		dangerTravelPanel = new JPanel();
		/***************************************P A N E L S****************************************/
		
		/***********************************A D D P A N E L S**************************************/
		norPan.add(heading);
		
		cenPan.setLayout(new GridLayout(6,1));
		
		cenPan.add(tempPanel);
		cenPan.add(sorePanel);
		cenPan.add(coughingingPanel);
		cenPan.add(throatSorePanel);
		cenPan.add(dangerTravelPanel);
		
		tempPanel.add(tempLabel);
		tempPanel.add(temp);
		
		sorePanel.add(soreLabel);
		sorePanel.add(sore);
		
		coughingingPanel.add(coughingingLabel);
		coughingingPanel.add(coughing);
		
		throatSorePanel.add(throatSoreLabel);
		throatSorePanel.add(throatSore);
		
		dangerTravelPanel.add(dangerTravelLabel);
		dangerTravelPanel.add(dangerTravel);
		
		
		souPan.add(selectFile);
		souPan.add(confirmChoices);
		
		add(norPan, BorderLayout.NORTH);
		add(cenPan, BorderLayout.CENTER);
		add(souPan, BorderLayout.SOUTH);
		/***********************************A D D P A N E L S**************************************/
		
		//size of window
		setSize(600, 600);
		
		//making window visible
		setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(cenPan, "Choices Confirmed");
	}
}