package handler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class dataHandler {
	
	public static ArrayList<String> readFile() {
		ArrayList<String> obtainedData = new ArrayList<String>();
	try {
		 File txtFile = new File("src/data/data.txt");
	      Scanner scnReader = new Scanner(txtFile);
	      while (scnReader.hasNextLine()) {
	        String fila = scnReader.nextLine();
	        obtainedData.add(fila);
	      }
	      scnReader.close();
	      System.out.println(obtainedData);
	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    }
	return obtainedData;
	}
	
	public static void splitData(ArrayList<String> information) {
		
		int i;
		for(i=0;i<information.size();i++) {
		System.out.println("Nombre:");
		System.out.println(information.get(i).substring(0, information.get(i).indexOf("=")));
		System.out.println("Intervalos de trabajo:");
		System.out.println(information.get(i).substring(information.get(i).indexOf("=")+1));
		}
	}
	
	
	
	
	
	
}
