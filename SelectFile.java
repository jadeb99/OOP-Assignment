import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class SelectFile {
	
	Scanner scan;
	String dataFile;

	

	public SelectFile (File data) {

		this.dataFile = data.getName();
		
		try {
			Scanner scan = new Scanner(new File(dataFile));
			
			scan.useDelimiter(",");
			
			while (scan.hasNext()) {
				
				System.out.print(scan.next() + " ");
			}
			
			scan.close();
			
			
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
	}
	
}