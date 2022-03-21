package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Patient extends Person {
	static ArrayList<VitalSigns> vitalSignsList = new ArrayList<VitalSigns>();
	static Map<Patient, ArrayList<VitalSigns>> encounterHistory = new HashMap<Patient, ArrayList<VitalSigns>>();

	public static void addVitalSigns(VitalSigns vs) {
		vitalSignsList.add(vs);
	}

	public static ArrayList<VitalSigns> getVitalSignsList() {
		return vitalSignsList;
	}

	public static void setVitalSignsList(final ArrayList<VitalSigns> vitalSignsList) {
		Patient.vitalSignsList = vitalSignsList;
	}

	public static Map<Patient, ArrayList<VitalSigns>> getEncounterHistory() {
		return encounterHistory;
	}

	public static void setEncounterHistory(final Map<Patient, ArrayList<VitalSigns>> encounterHistory) {
		Patient.encounterHistory = encounterHistory;
	}

	public static Comparator<VitalSigns> dateComparator = (VitalSigns v1, VitalSigns v2) -> {
		LocalDateTime date1 = v1.getEntryDateTime();
		LocalDateTime date2 = v2.getEntryDateTime();
		return date2.compareTo(date1);
	};
}