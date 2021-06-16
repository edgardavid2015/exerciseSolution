package classes;

import handler.hourHandler;

public class HourWorked {
	private String startHour;
	private String finishHour;
	
	public HourWorked(String startHour, String finishHour) {
		super();
		this.startHour = hourHandler.getStartHour(startHour);
		this.finishHour = hourHandler.getFinishHour(finishHour);
	}
	public String getStartHour() {
		return startHour;
	}
	public void setStartHour(String startHour) {
		this.startHour = hourHandler.getStartHour(startHour);
	}
	public String getFinishHour() {
		return finishHour;
	}
	public void setFinishHour(String finishHour) {
		this.finishHour = hourHandler.getFinishHour(finishHour);
	}
}
