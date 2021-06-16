package handler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class dataHandler {
	
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
	
	public static String splitName(String fileLine) {
		
		String[] aux = fileLine.split("=");
		return aux[0];
	}
	
	public static String splitWork(String fileLine) {
		String[] aux = fileLine.split("=");
		return aux[1];
	}
	
	public static String[] weekWorked(String dataArray) {
		dataArray.split(",");
		String[] workedRanges = dataArray.split(",");
		return workedRanges;

	}
	
	public static String getAcronymdayWorked(String rangeWorked) {
		
		String dayAcronym = rangeWorked.substring(0, 2);
		return dayAcronym;
	}
	
	public static String getRangeWorked(String rangeWorked) {
		
		String range = rangeWorked.substring(2);
		return range;
	}
}
