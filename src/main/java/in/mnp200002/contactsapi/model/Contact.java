package in.mnp200002.contactsapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact")
public class Contact {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Contact_id;

	private String Fname;
	
	private String Mname;
	
	private String Lname;
	
//	@OneToMany(targetEntity = Address.class, cascade = CascadeType.ALL)
//	@JoinColumn(name="cid", referencedColumnName = "Contact_id", insert = "false", update = "false")
//	private List<Address> address;
//	
//	@OneToMany(targetEntity = Phone.class, cascade = CascadeType.ALL)
//	@JoinColumn(name="cid", referencedColumnName = "Contact_id", insert = "false", update = "false")
//	private List<Phone> phone;
//	
//	@OneToMany(targetEntity = Date.class, cascade = CascadeType.ALL)
//	@JoinColumn(name="cid", referencedColumnName = "Contact_id", insert = "false", update = "false")
//	private List<Date> date;
	
	public Integer getContactId() {
		return Contact_id;
	}

	public void setContactId(Integer Contact_id) {
		this.Contact_id = Contact_id;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String Fname) {
		this.Fname = Fname;
	}

	public String getMname() {
		return Mname;
	}

	public void setMname(String Mname) {
		this.Mname = Mname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String Lname) {
		this.Lname = Lname;
	}
}
