package studio9;

import java.util.HashMap;
import java.util.Map;

import assignment7.Student;

public class UniversityDatabase {
	//TODO: Complete this class according to the studio instructions
	private final Map<String, Student> accountRoster= new HashMap<>();
	
	public UniversityDatabase() {
	}

	public void addStudent(String accountName, Student student) {
		accountRoster.put(accountName, student);
	}

	public int getStudentCount() {
		// TODO
		return 0;
	}

	public String lookupFullName(String accountName) {
		// TODO: Complete according to studio instructions
		return null;
	}

	public double getTotalBearBucks() {
		// TODO
		return 0.0;
	}
}
