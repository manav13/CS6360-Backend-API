package in.mnp200002.contactsapi.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name="date")
public class Date {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Date_id;
	
	private Integer Contact_id;
	
	private String Date_type;
	
	private LocalDate Date;
	
//	@ManyToOne
//	@MapsId
//	@JoinColumn(name = "Contact_id", insertable=false, updatable=false)
//	private Contact contact;

	public Integer getDate_id() {
		return Date_id;
	}
	
	public void setDate_id(LocalDate date) {
		Date = date;
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
