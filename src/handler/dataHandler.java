package handler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
	
	private static void splitData(ArrayList<String> information) {
		int i;
		ArrayList<String> employeeNames = new ArrayList<String>();
		ArrayList<String> daysAndRanges = new ArrayList<String>();
		
		for(i=0;i<information.size();i++) {
			String[] aux = information.get(i).split("=");
			employeeNames.add(aux[0]);
			daysAndRanges.add(aux[1]);
		}
		
		weekWorked(daysAndRanges);
	}
	
	private static void weekWorked(ArrayList<String> dataArray) {
		int j,k;
		ArrayList<String> workedRanges = new ArrayList<String>();
		for(j=0;j<dataArray.size();j++) {
			String[] aux = dataArray.get(j).split(",");
			for(k=0;k<aux.length;k++) {
				workedRanges.add(aux[k]);
			}
		}
		daysWorked(workedRanges);
		rangeWorked(workedRanges);
	}
	
	public static ArrayList<String> daysWorked(ArrayList<String> dataArray) {
		int l;
		ArrayList<String> weekdays = new ArrayList<String>();
		
		for(l=0;l<dataArray.size();l++) {
			weekdays.add(dataArray.get(l).substring(0, 2));
		}
		return weekdays;
	}
	
	public static ArrayList<String> rangeWorked(ArrayList<String> dataArray) {
		int m;
		ArrayList<String> timerange = new ArrayList<String>();
		
		for(m=0;m<dataArray.size();m++) {
			timerange.add(dataArray.get(m).substring(2));
		}
		return timerange;
	}
}
