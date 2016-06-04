package ro.sci.CompanyManagementSystem;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * This class holds all the employees in different lists ordered by the role in the Company.
 * <p>
 * @author Adelina
 *
 */

public class Company {
	ArrayList<Employee> listOfEmployees = new ArrayList<>();
	TreeMap<Employee, ArrayList<Employee>> employeesWithoutParking = new TreeMap<>();
	ArrayList<Employee> engineers = new ArrayList<>();
	ArrayList<Employee> developers = new ArrayList<>();
	ArrayList<Employee> managers = new ArrayList<>();
	ArrayList<Employee> testers = new ArrayList<>();

	public TreeMap<Employee, ArrayList<Employee>> getEmployeesWithoutParking() {
		return employeesWithoutParking;

	}

	public void sortByParkingSpace(ArrayList<Employee> employee, boolean ParkingSpace) throws Exception {
		if (ParkingSpace == false) {
	      employeesWithoutParking.put(null, employee);
		} else {
			throw new Exception();
		}

	}

}
