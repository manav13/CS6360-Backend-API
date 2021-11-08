package in.mnp200002.contactsapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mnp200002.contactsapi.model.Phone;
import in.mnp200002.contactsapi.model.PhoneDTO;
import in.mnp200002.contactsapi.repository.PhoneRepository;

@Service
public class PhoneService implements PhoneServiceInterface {
	
	public final PhoneRepository phoneRepository;
	
	@Autowired
	public PhoneService(PhoneRepository phoneRepository) {
		this.phoneRepository = phoneRepository;
	}
	
	@Override
	public List<Phone> getPhone(Integer id) {
		return phoneRepository.findPhoneByContact_id(id);
	}

	public void addPhone(List<PhoneDTO> phoneDTO, Integer contactId) {
		
		for(int i=0; i<phoneDTO.size(); i++) {
			Phone phone = new Phone();
			phone.setContact_id(contactId);
			phone.setArea_code(phoneDTO.get(i).getArea_code());
			phone.setNumber(phoneDTO.get(i).getNumber());
			phone.setPhone_type(phoneDTO.get(i).getPhone_type());
			
			phoneRepository.save(phone);
		}
	}

	public void updatePhone(List<PhoneDTO> phoneDTO, Integer contact_id) {
		
		List<Phone> existingPhone = phoneRepository.findPhoneByContact_id(contact_id);
		
		for(int i=0; i<phoneDTO.size(); i++) {
			existingPhone.get(i).setArea_code(phoneDTO.get(i).getArea_code());
			existingPhone.get(i).setNumber(phoneDTO.get(i).getNumber());
			existingPhone.get(i).setPhone_type(phoneDTO.get(i).getPhone_type());
			
			phoneRepository.save(existingPhone.get(i));
		}
		
	}

	public void deletePhone(Integer contact_id) {
		phoneRepository.deletePhoneByContact_id(contact_id);
	}

}
