package classes;

import handler.hourHandler;

public class DayWorked {
	
	private String dayAcronym;
	private boolean weekDay;
	
	public String getDayAcronym() {
		return dayAcronym;
	}
	public void setDayAcronym(String dayAcronym) {
		this.dayAcronym = dayAcronym;
	}
	public boolean getWeekDay() {
		return weekDay;
	}
	public void setWeekDay(boolean weekOrWeekend) {
		this.weekDay = weekOrWeekend;
	}
	
	public DayWorked(String dayAcronym, boolean weekOrWeekend) {
		super();
		this.dayAcronym = dayAcronym;
		this.weekDay = weekOrWeekend;
	}
	public int priceforDay(String range) {
		
		HourWorked auxiliar = new HourWorked(range, range);

		int priceAux = 0;
		if(this.getWeekDay()) {
			priceAux+=hourHandler.getWeekPrice(auxiliar.getStartHour(),auxiliar.getFinishHour(),25,15,20);
		}
		if(!this.getWeekDay()) {
			priceAux+=hourHandler.getWeekPrice(auxiliar.getStartHour(), auxiliar.getFinishHour(),30,20,25);
		}
		
		return priceAux;
	}

}
