package in.mnp200002.contactsapi.model;

import java.io.Serializable;

public class ContactDTO implements Serializable{
	
	private Integer Contact_id;

	private String Fname;
	
	private String Mname;
	
	private String Lname;

	public Integer getContact_id() {
		return Contact_id;
	}

	public void setContact_id(Integer contact_id) {
		Contact_id = contact_id;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getMname() {
		return Mname;
	}

	public void setMname(String mname) {
		Mname = mname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

}
