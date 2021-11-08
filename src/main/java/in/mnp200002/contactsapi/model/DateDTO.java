package in.mnp200002.contactsapi.model;

import java.io.Serializable;
import java.time.LocalDate;

public class DateDTO implements Serializable {
	
	private Integer Date_id;
	
	private Integer Contact_id;
	
	private String Date_type;
	
	private LocalDate Date;

	public Integer getDate_id() {
		return Date_id;
	}

	public void setDate_id(Integer date_id) {
		Date_id = date_id;
	}

	public Integer getContact_id() {
		return Contact_id;
	}

	public void setContact_id(Integer contact_id) {
		Contact_id = contact_id;
	}

	public String getDate_type() {
		return Date_type;
	}

	public void setDate_type(String date_type) {
		Date_type = date_type;
	}

	public LocalDate getDate() {
		return Date;
	}

	public void setDate(LocalDate date) {
		Date = date;
	}

}
