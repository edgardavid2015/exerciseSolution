package main;

import java.util.ArrayList;

import classes.Employee;
import handler.dataHandler;

public class Main {
	
	public static void main(String []args) {
		int i,j;
		ArrayList<Employee> employees = new ArrayList<Employee>();
		String employeeName = new String();
		String weekWorked = new String();
		Employee employee = new Employee();
		
		System.out.println("DATA TO BE PROCESSED:");
		for(i=0;i<dataHandler.readFile("src/data/data.txt").size();i++){
			System.out.println(dataHandler.readFile("src/data/data.txt").get(i));
			}
		System.out.println("\nRESULT:");
		for(i=0;i<dataHandler.readFile("src/data/data.txt").size();i++){
	    	employeeName = dataHandler.splitName(dataHandler.readFile("src/data/data.txt").get(i));
	    	weekWorked = dataHandler.splitWork(dataHandler.readFile("src/data/data.txt").get(i));
	    	employee.setName(employeeName);
	    	employee.setSalary(employee.salarytoPay(weekWorked));
	    	employees.add(employee);
	    	for (j = 0; j < employees.size(); j++) {
				System.out.println("THE AMOUNT TO PAY TO "+employees.get(j).getName()+" IS "+employees.get(j).getSalary()+" USD");
		    }
	    	employees.clear();
		}
	}
}
