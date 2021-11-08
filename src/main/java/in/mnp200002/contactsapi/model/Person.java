package in.mnp200002.contactsapi.model;

import java.util.List;

public class Person {
	
	ContactDTO contact;
	
	List<AddressDTO> address;
	
	List<PhoneDTO> phone;
	
	List<DateDTO> date;

	public ContactDTO getContact() {
		return contact;
	}

	public void setContact(ContactDTO contact) {
		this.contact = contact;
	}

	public List<AddressDTO> getAddress() {
		return address;
	}

	public void setAddress(List<AddressDTO> address) {
		this.address = address;
	}

	public List<PhoneDTO> getPhone() {
		return phone;
	}

	public void setPhone(List<PhoneDTO> phone) {
		this.phone = phone;
	}

	public List<DateDTO> getDate() {
		return date;
	}

	public void setDate(List<DateDTO> date) {
		this.date = date;
	}
	
	

}
