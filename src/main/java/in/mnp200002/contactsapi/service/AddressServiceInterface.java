package in.mnp200002.contactsapi.service;

import java.util.List;

import in.mnp200002.contactsapi.model.Address;

public interface AddressServiceInterface {
	List<Address> getAddress(Integer id);
}
