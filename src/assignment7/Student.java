package assignment7;

//TODO: Copy a working Student class from Assignment 7 over this file.
public class Student {
	
	private String firstName;
	private String lastName;
	private int id;
	private double bearBucksBalance;
	
	public Student(String tfirstName, String tlastName, int tid) {
		firstName = tfirstName;
		lastName = tlastName;
		id = tid;
	}

	public String getFullName() {
		return firstName + " " + lastName;
	}

	public int getId() {
		return id;
	}

	public void depositBearBucks(double amount) {
		bearBucksBalance += amount;
	}

	public double getBearBucksBalance() {
		return bearBucksBalance;
	}
}
