package in.mnp200002.contactsapi.model;

import java.io.Serializable;

public class AddressDTO implements Serializable{
	
	private Integer Address_id;
	
	private Integer Contact_id;
	
	private String Address_type;
	
	private String Address;
	
	private String City;
	
	private String State;
	
	private Integer Zip;

	public Integer getAddress_id() {
		return Address_id;
	}

	public void setAddress_id(Integer address_id) {
		Address_id = address_id;
	}

	public Integer getContact_id() {
		return Contact_id;
	}

	public void setContact_id(Integer contact_id) {
		Contact_id = contact_id;
	}

	public String getAddress_type() {
		return Address_type;
	}

	public void setAddress_type(String address_type) {
		Address_type = address_type;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public Integer getZip() {
		return Zip;
	}

	public void setZip(Integer zip) {
		Zip = zip;
	}
	
	
}
