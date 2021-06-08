package handler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class dataHandler {
	
	public static void readFile() {
		ArrayList<String> obtainedData = new ArrayList<String>();
	try {
		 File txtFile = new File("src/data/data.txt");
	      Scanner scnReader = new Scanner(txtFile);
	      while (scnReader.hasNextLine()) {
	        String row = scnReader.nextLine();
	        obtainedData.add(row);
	      }
	      scnReader.close();
	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    }
	splitData(obtainedData);
	}
	
	private static HashMap<String, String> splitData(ArrayList<String> information) {
		int i;
		ArrayList<String> employeeNames = new ArrayList<String>();
		ArrayList<String> daysAndRanges = new ArrayList<String>();
		HashMap<String, String> employeesAndRanges = new HashMap<String, String>();
		
		for(i=0;i<information.size();i++) {
			String[] a = information.get(i).split("=");
			employeeNames.add(a[0]);
			daysAndRanges.add(a[1]);
			employeesAndRanges.put(employeeNames.get(i), daysAndRanges.get(i));
		}
		return employeesAndRanges;
	}
}
