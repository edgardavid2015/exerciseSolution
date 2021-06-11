package main;

import java.util.ArrayList;

import classes.Employee;
import handler.*;

public class Main {
	
	public static void main(String []args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
	    for (String element : dataHandler.splitName(dataHandler.readFile("src/data/data.txt"))) {
	    	Employee employee = new Employee();
	    	employee.setName(element);
	    	employees.add(employee);
		}
	    for (int i = 0; i < employees.size(); i++) {
			System.out.println(employees.get(i).getName());
		}

	}

}
