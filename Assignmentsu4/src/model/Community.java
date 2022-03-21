package model;

public class Community {

	String name;
	int id;
	String city;
	String houseCode;

	public int getId() {
		return id;
	}
        //Getter
	public void setId(final int communityId) {
		this.id = communityId;
	}
        //setter
	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(final String city) {
		this.city = city;
	}

	public String getHouseCode() {
		return houseCode;
	}

	public void setHouseCode(final String houseCode) {
		this.houseCode = houseCode;
	}
}
