package in.mnp200002.contactsapi.model;

import java.io.Serializable;

public class PhoneDTO implements Serializable {
	
	private Integer Phone_id;
	
	private Integer Contact_id;
	
	private String Phone_type;
	
	private Integer Area_code;
	
	private String Number;

	public Integer getPhone_id() {
		return Phone_id;
	}

	public void setPhone_id(Integer phone_id) {
		Phone_id = phone_id;
	}

	public Integer getContact_id() {
		return Contact_id;
	}

	public void setContact_id(Integer contact_id) {
		Contact_id = contact_id;
	}

	public String getPhone_type() {
		return Phone_type;
	}

	public void setPhone_type(String phone_type) {
		Phone_type = phone_type;
	}

	public Integer getArea_code() {
		return Area_code;
	}

	public void setArea_code(Integer area_code) {
		Area_code = area_code;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}

}
