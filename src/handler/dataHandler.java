package handler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import classes.Employee;

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
	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    }
	splitData(obtainedData);
	return obtainedData;
	}
	
	public static void splitData(ArrayList<String> information) {
		int i;
		HashMap<String, String>timeworked = new HashMap<String,String>();
		for(i=0;i<information.size();i++) {
			Employee Employee = new Employee();
			Employee.setName(information.get(i).substring(0, information.get(i).indexOf("=")));
			System.out.println("Nombre del empleado:"+Employee.getName());
			//Employee.setWorktime(worktime);
			System.out.println("Intervalos de trabajo:");
			System.out.println(information.get(i).substring(information.get(i).indexOf("=")+1,information.get(i).indexOf("=")+3));
		}
	}
	
	
	
	
	
	
}
