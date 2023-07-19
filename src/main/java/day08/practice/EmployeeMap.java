package day08.practice;

import java.util.*;

public class EmployeeMap {
	
	public static void main(String[] args) {
		
		String input = "HR,Ram,HR,Suresh,IT,Basker,IT,Joseph,Admin,Sundar";
		String[] tokens = input.split(",");
		
		Map<String, List<String>> deptEmployees = new HashMap<>();
		
		for (int i = 0; i < tokens.length; i += 2) {
			String dept = tokens[i];
			String employee = tokens[i + 1];
			if (!deptEmployees.containsKey(dept)) {
				deptEmployees.put(dept, new ArrayList<>());
			}
			deptEmployees.get(dept).add(employee);
		}
		
		
		for (Map.Entry<String, List<String>> entry : deptEmployees.entrySet()) {
			String dept = entry.getKey();
			List<String> employees = entry.getValue();
			String employeesStr = String.join(" , ", employees);
			System.out.println(dept + " : " + employeesStr);
		}
	}
}