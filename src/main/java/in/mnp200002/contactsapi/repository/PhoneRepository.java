package in.mnp200002.contactsapi.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.mnp200002.contactsapi.model.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Integer> {
	
	@Query("SELECT c FROM Phone c WHERE c.Contact_id = ?1")
	public List<Phone> findPhoneByContact_id(Integer contact_id);

	@Transactional
	@Modifying
	@Query("DELETE FROM Phone c WHERE c.Contact_id = ?1")
	public void deletePhoneByContact_id(Integer contact_id);
}
