package objects;

import java.util.HashMap;

public class Employee {
	String name;
	HashMap<String, String>worktime;

	
	public Employee() {}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public HashMap<String, String> getWorktime() {
		return worktime;
	}


	public void setWorktime(HashMap<String, String> worktime) {
		this.worktime = worktime;
	}
	
	

	
}
