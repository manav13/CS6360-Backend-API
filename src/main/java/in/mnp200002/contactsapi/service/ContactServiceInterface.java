package in.mnp200002.contactsapi.service;

import java.util.List;

import in.mnp200002.contactsapi.model.Contact;
import in.mnp200002.contactsapi.model.ContactDTO;

public interface ContactServiceInterface {

	List<Contact> getContacts();
	
	Integer addContact(ContactDTO contact);
}
