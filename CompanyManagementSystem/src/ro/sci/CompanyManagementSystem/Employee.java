package ro.sci.CompanyManagementSystem;

/**
 * This class is a description of an employee.
 * <p>
 * 
 * @author Adelina
 *
 */

public class Employee implements Comparable<Employee> {
	private String name;
	private boolean parkingSpace;
	private int seniority;
	private String role;

	public Employee(String name, boolean parkingSpace, int seniority, String role) {
		this.name = name;
		this.parkingSpace = parkingSpace;
		this.seniority = seniority;
		this.role = role;

	}

	public String getName() {
		return name;
	}

	public boolean isParkingSpace() {
		return parkingSpace;
	}

	public int getSeniority() {
		return seniority;
	}

	public String getRole() {
		return role;
	}

	/**
	 * This method displays one object as a string at runtime.
	 */

	@Override
	public String toString() {
		return "Employee (" + name + ", Parking Space - " + parkingSpace + ", " + seniority + ", " + role + ")";
	}

	@Override
	public int compareTo(Employee compareEmployee) {
		int compareSeniority = ((Employee) compareEmployee).getSeniority();

		return compareSeniority - this.seniority;
	}
}
