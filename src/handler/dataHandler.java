package handler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class dataHandler {
	
	public dataHandler() {}
	
	public static ArrayList<String> readFile(String dataURL) {
		ArrayList<String> obtainedData = new ArrayList<String>();
	try {
		 File txtFile = new File(dataURL);
	      Scanner scnReader = new Scanner(txtFile);
	      while (scnReader.hasNextLine()) {
	        String row = scnReader.nextLine();
	        obtainedData.add(row);
	      }
	      scnReader.close();
	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    }
	return obtainedData;
	}
	
	public static ArrayList<String> splitName(ArrayList<String> information) {
		int i;
		ArrayList<String> employeeNames = new ArrayList<String>();
		
		for(i=0;i<information.size();i++) {
			String[] aux = information.get(i).split("=");
			employeeNames.add(aux[0]);
		}
		return employeeNames;
	}
	
	public static ArrayList<String> splitWork(ArrayList<String> information) {
		int i;
		ArrayList<String> daysAndRanges = new ArrayList<String>();
		
		for(i=0;i<information.size();i++) {
			String[] aux = information.get(i).split("=");
			daysAndRanges.add(aux[1]);
		}
		return daysAndRanges;
		
	}
	
	public static ArrayList<String> weekWorked(ArrayList<String> dataArray) {
		int i,j;
		ArrayList<String> workedRanges = new ArrayList<String>();
		
		for(i=0;i<dataArray.size();i++) {
			String[] aux = dataArray.get(i).split(",");
			for(j=0;j<aux.length;j++) {
				workedRanges.add(aux[j]);
			}
		}
		return workedRanges;
	}
	
	public static ArrayList<String> daysWorked(ArrayList<String> dataArray) {
		int i;
		ArrayList<String> weekDays = new ArrayList<String>();
		
		for(i=0;i<dataArray.size();i++) {
			weekDays.add(dataArray.get(i).substring(0, 2));
		}
		return weekDays;
	}
	
	public static ArrayList<String> rangeWorked(ArrayList<String> dataArray) {
		int i;
		ArrayList<String> timeRange = new ArrayList<String>();
		
		for(i=0;i<dataArray.size();i++) {
			timeRange.add(dataArray.get(i).substring(2));
		}
		return timeRange;
	}
}
