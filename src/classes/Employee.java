package classes;

import handler.dataHandler;
import handler.hourHandler;;

public class Employee {
	
	private String name;
	private int salary;
	
	public Employee() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int salarytoPay(String dataArray) {
		int salaryAux=0;
		String[] RangesToPay = dataHandler.weekWorked(dataArray);
		for (String range : RangesToPay) {
			String workedRange = dataHandler.getRangeWorked(range);
			String acronymDay = dataHandler.getAcronymdayWorked(range);
			for (String weekDay : hourHandler.WEEK) {
				if(weekDay.equals(acronymDay)) {
					DayWorked day = new DayWorked(acronymDay,true);
					salaryAux = salaryAux + day.priceforDay(workedRange);
				}
			}
			for (String weekendDay : hourHandler.WEEKEND) {
				if(weekendDay.equals(acronymDay)) {
					DayWorked day = new DayWorked(acronymDay,false);
					salaryAux = salaryAux + day.priceforDay(workedRange);
				}
			}
		}
		return salaryAux;
	}
}
