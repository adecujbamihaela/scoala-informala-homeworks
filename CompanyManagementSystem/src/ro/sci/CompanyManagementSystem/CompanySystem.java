package ro.sci.CompanyManagementSystem;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * This class adds and displays all employees to a list and adds employees without parking space ordered by seniority into a TreeMap collection.
 * <p>
 * 
 * @author Adelina
 *
 */

public class CompanySystem {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Julien", false, 3, "engineer");
		Employee emp2 = new Employee("Raul", false, 5, "manager");
		Employee emp3 = new Employee("Richard", true, 2, "tester");
		Employee emp4 = new Employee("Gerard", false, 8, "developer");
		Employee emp5 = new Employee("Anne", true, 9, "developer");
		Employee emp6 = new Employee("Jack", false, 1, "engineer");
		Employee emp7 = new Employee("David", false, 6, "manager");
		Employee emp8 = new Employee("Rey", true, 11, "tester");

		ArrayList<Employee> listOfEmployees = new ArrayList<>();
		listOfEmployees.add(emp1);
		listOfEmployees.add(emp2);
		listOfEmployees.add(emp3);
		listOfEmployees.add(emp4);
		listOfEmployees.add(emp5);
		listOfEmployees.add(emp6);
		listOfEmployees.add(emp7);
		listOfEmployees.add(emp8);
		System.out.println("The list of employees is the following one:" + listOfEmployees);

		TreeMap<Integer, Employee> employeesWithoutParking = new TreeMap<>();
		employeesWithoutParking.put(3, emp1);
		employeesWithoutParking.put(5, emp2);
		employeesWithoutParking.put(8, emp4);
		employeesWithoutParking.put(1, emp6);
		employeesWithoutParking.put(6, emp7);

		for (Map.Entry<Integer, Employee> entry : employeesWithoutParking.entrySet()) {
			{
				boolean parkingSpace = false;
				if (parkingSpace == false) {
				}
				System.out.println(entry.getKey() + "/" + entry.getValue());
			}

		}

	}
}