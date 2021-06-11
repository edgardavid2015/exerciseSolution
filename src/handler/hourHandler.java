package handler;

import java.util.ArrayList;

public class hourHandler {
	
	public static void rangeToPay(ArrayList<String> timeRange) {
		int i;
		ArrayList<String> startTime = new ArrayList<String>();
		ArrayList<String> finishTime = new ArrayList<String>();
		
		for(i=0;i<timeRange.size();i++) {
			String[] aux = timeRange.get(i).split("-");
			startTime.add(aux[0]);
			finishTime.add(aux[1]);
		}
	}
	
	public static int convertToMinutes(ArrayList<String> hours) {
		int i;
		int minutes = 0;
		ArrayList<String> hourArray = new ArrayList<String>();
		ArrayList<String> minutesArray = new ArrayList<String>();
		
		for(i=0;i<hours.size();i++) {
			String[] aux = hours.get(i).split(":");
			hourArray.add(aux[0]);
			minutesArray.add(aux[1]);
		}
		for(i=0;i<hourArray.size();i++) {
			minutes = Integer.parseInt(hourArray.get(i))*60+Integer.parseInt(minutesArray.get(i));
		}
		return minutes;
	}
	
	

}
