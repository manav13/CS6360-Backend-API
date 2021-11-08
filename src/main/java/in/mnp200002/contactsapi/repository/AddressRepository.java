package in.mnp200002.contactsapi.repository;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.mnp200002.contactsapi.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
	
	@Query("SELECT c FROM Address c WHERE c.Contact_id = ?1")
	public List<Address> findAddressByContact_id(Integer contact_id);
	
	@Transactional
	@Modifying
	@Query("DELETE FROM Address c WHERE c.Contact_id = ?1")
	public void deleteAddressByContact_id(Integer contact_id);
}
