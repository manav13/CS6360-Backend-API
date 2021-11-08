package in.mnp200002.contactsapi.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.mnp200002.contactsapi.model.Date;

@Repository
public interface DateRepository extends JpaRepository<Date, Integer> {
	
	@Query("SELECT c FROM Date c WHERE c.Contact_id = ?1")
	public List<Date> findDateByContact_id(Integer contact_id);

	@Transactional
	@Modifying
	@Query("DELETE FROM Date c WHERE c.Contact_id = ?1")
	public void deleteDateByContact_id(Integer contact_id);

}
