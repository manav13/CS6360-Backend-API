package in.mnp200002.contactsapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mnp200002.contactsapi.model.Date;
import in.mnp200002.contactsapi.model.DateDTO;
import in.mnp200002.contactsapi.repository.DateRepository;

@Service
public class DateService implements DateServiceInterface {
	
	public final DateRepository dateRepository;
	
	@Autowired
	public DateService(DateRepository dateRepository) {
		this.dateRepository = dateRepository;
	}
	
	@Override
	public List<Date> getDate(Integer id) {
		return dateRepository.findDateByContact_id(id);
	}

	public void addDate(List<DateDTO> dateDTO, Integer contactId) {
		for(int i=0; i<dateDTO.size(); i++) {
			Date date = new Date();
			date.setContact_id(contactId);
			date.setDate(dateDTO.get(i).getDate());
			date.setDate_type(dateDTO.get(i).getDate_type());
			dateRepository.save(date);
		}
	}

	public void updateDate(List<DateDTO> dateDTO, Integer contact_id) {
		List<Date> existingDate = dateRepository.findDateByContact_id(contact_id);
		
		for(int i=0; i<dateDTO.size(); i++) {
			existingDate.get(i).setDate(dateDTO.get(i).getDate());
			existingDate.get(i).setDate_type(dateDTO.get(i).getDate_type());
			
			dateRepository.save(existingDate.get(i));
		}
		
	}

	public void deleteDate(Integer contact_id) {
		dateRepository.deleteDateByContact_id(contact_id);
	}

}
