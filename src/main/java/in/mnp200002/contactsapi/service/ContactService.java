package in.mnp200002.contactsapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mnp200002.contactsapi.model.Contact;
import in.mnp200002.contactsapi.model.ContactDTO;
import in.mnp200002.contactsapi.repository.ContactRepository;

@Service
public class ContactService implements ContactServiceInterface {

	public final ContactRepository contactRepository;
	
	@Autowired
	public ContactService(ContactRepository contactRepository) {
		this.contactRepository = contactRepository;
	}
	
	@Override
	public List<Contact> getContacts() {
		return contactRepository.findAll();
	}
	
	public Integer addContact(ContactDTO contactDTO) {
		Contact contact = new Contact();
		
		contact.setFname(contactDTO.getFname());
		contact.setLname(contactDTO.getLname());
		contact.setMname(contactDTO.getMname());
		
		contactRepository.save(contact);
		
		return contact.getContactId();
	}

	public void updateContact(ContactDTO contactDTO, Integer contactId) {
		Contact existingContact = contactRepository.findById(contactId).get();
		existingContact.setFname(contactDTO.getFname());
		existingContact.setLname(contactDTO.getLname());
		existingContact.setMname(contactDTO.getMname());
		
		contactRepository.save(existingContact);
	}

	public void deleteContact(Integer contact_id) {
		contactRepository.deleteContactByContact_id(contact_id);
	}

	public Contact getSingleContact(Integer contact_id) {
		return contactRepository.findById(contact_id).get();
	}
}
