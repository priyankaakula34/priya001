package model;

public class Person {

	Community community;
	int patientCode;
	String patientName;
	String dateOfBirth;
	int age;

	public Person() {
	}
        //constructor
	public Person(final int patientCode, final String patientName, final String dateOfBirth, final int age,
			final Community community) {
		this.patientCode = patientCode;
		this.patientName = patientName;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.community = community;
        //this is used to refer current class instance variable
	}

	public void setCommunity(final Community community) {
		this.community = community;
	}

	public Community getCommunity() {
		return community;
	}

	public void setPatientId(final int patientCode) {
		this.patientCode = patientCode;
	}

	public int getPatientId() {
		return patientCode;
	}

	public void setPatientName(final String patientName) {
		this.patientName = patientName;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setDateOfBirth(final String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setAge(final int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}
