package classes;

import handler.hourHandler;

public class DayWorked {
	
	private String dayAcronym;
	private boolean weekOrWeekend;
	
	public String getDayAcronym() {
		return dayAcronym;
	}
	public void setDayAcronym(String dayAcronym) {
		this.dayAcronym = dayAcronym;
	}
	public boolean getWeekOrWeekend() {
		return weekOrWeekend;
	}
	public void setWeekOrWeekend(boolean weekOrWeekend) {
		this.weekOrWeekend = weekOrWeekend;
	}
	
	public DayWorked(String dayAcronym, boolean weekOrWeekend) {
		super();
		this.dayAcronym = dayAcronym;
		this.weekOrWeekend = weekOrWeekend;
	}
	public int priceforDay(String range) {
		
		HourWorked auxiliar = new HourWorked(range, range);

		int priceAux = 0;
		if(this.getWeekOrWeekend()) {
			priceAux+=hourHandler.getPriceWeekday(auxiliar.getStartHour(),auxiliar.getFinishHour());
		}
		if(!this.getWeekOrWeekend()) {
			priceAux+=hourHandler.getPriceWeekend(auxiliar.getStartHour(), auxiliar.getFinishHour());
		}
		
		return priceAux;
	}

}
