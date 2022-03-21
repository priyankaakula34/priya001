package model;

import java.time.LocalDateTime;
import java.util.Date;

public class VitalSigns {

	LocalDateTime entryDateTime;
	int age;
	Date dateOfBirth;
	Double sysBP;

	public void setEntryDateTime(final LocalDateTime entryDateTime) {
		this.entryDateTime = entryDateTime;
	}

	public LocalDateTime getEntryDateTime() {
		return entryDateTime;
	}

	public void setAge(final int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setDateOfBirth(final Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setSysBP(final Double sysBP) {
		this.sysBP = sysBP;
	}

	public Double getSysBP() {
		return sysBP;
	}

	@Override
	public String toString() {
		return "Systolic Blood Pressure= " + sysBP;
	}
}
