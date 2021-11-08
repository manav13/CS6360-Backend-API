package in.mnp200002.contactsapi.service;

import java.util.List;

import in.mnp200002.contactsapi.model.Phone;

public interface PhoneServiceInterface {
	List<Phone> getPhone(Integer id);
}
