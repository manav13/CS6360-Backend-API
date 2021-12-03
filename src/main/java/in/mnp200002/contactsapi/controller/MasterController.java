package in.mnp200002.contactsapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import in.mnp200002.contactsapi.model.Address;
import in.mnp200002.contactsapi.model.Contact;
import in.mnp200002.contactsapi.model.Date;
import in.mnp200002.contactsapi.model.Person;
import in.mnp200002.contactsapi.model.Phone;
import in.mnp200002.contactsapi.model.SingleContact;
import in.mnp200002.contactsapi.service.AddressService;
import in.mnp200002.contactsapi.service.ContactService;
import in.mnp200002.contactsapi.service.DateService;
import in.mnp200002.contactsapi.service.PhoneService;

@CrossOrigin(origins = "*")
@RestController
public class MasterController {
	
	private final ContactService contactService;
	private final AddressService addressService;
	private final PhoneService phoneService;
	private final DateService dateService;
	
	@Bean
	public WebMvcConfigurer configure() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/*").allowedOrigins("*");
			}
			
		};
	}
	
	@Autowired
	public MasterController(ContactService contactService, AddressService addressService, PhoneService phoneService, DateService dateService) {
		this.contactService = contactService;
		this.addressService = addressService;
		this.phoneService = phoneService;
		this.dateService = dateService;
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/contacts")
	public List<Contact> getContacts() {
		return contactService.getContacts();
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/contacts/{id}")
	public SingleContact getSingleContact(@PathVariable(value="id") Integer id) {
		
		SingleContact person = new SingleContact();
		person.setAddress(addressService.getAddress(id));
		person.setContact(contactService.getSingleContact(id));
		person.setDate(dateService.getDate(id));
		person.setPhone(phoneService.getPhone(id));
		
		return person;
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "contacts/address/{id}")
	public List<Address> getAddress(@PathVariable(value="id") Integer id) {
		return addressService.getAddress(id);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "contacts/phone/{id}")
	public List<Phone> getPhone(@PathVariable(value="id") Integer id) {
		return phoneService.getPhone(id);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "contacts/date/{id}")
	public List<Date> getDate(@PathVariable(value="id") Integer id) {
		return dateService.getDate(id);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(method = RequestMethod.POST, value="contacts/addContact")
	public void addPerson(@RequestBody Person person) {
		Integer contactId = contactService.addContact(person.getContact());
		addressService.addAddress(person.getAddress(), contactId);
		phoneService.addPhone(person.getPhone(), contactId);
		dateService.addDate(person.getDate(), contactId);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(method = RequestMethod.PUT, value="contacts/updateContact/{id}")
	public void updatePerson(@RequestBody Person person, @PathVariable(value="id") Integer contact_id) {
		contactService.updateContact(person.getContact(), contact_id);
		addressService.updateAddress(person.getAddress(), contact_id);
		phoneService.updatePhone(person.getPhone(), contact_id);
		dateService.updateDate(person.getDate(), contact_id);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(method = RequestMethod.DELETE, value="contacts/deleteContact/{id}")
	public void deletePerson(@PathVariable(value="id") Integer contact_id) {
		addressService.deleteAddress(contact_id);
		phoneService.deletePhone(contact_id);
		dateService.deleteDate(contact_id);
		contactService.deleteContact(contact_id);
	}
}
