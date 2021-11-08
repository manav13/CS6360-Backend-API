package in.mnp200002.contactsapi.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.mnp200002.contactsapi.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

	@Transactional
	@Modifying
	@Query("DELETE FROM Contact c WHERE c.Contact_id = ?1")
	void deleteContactByContact_id(Integer contact_id);

}
