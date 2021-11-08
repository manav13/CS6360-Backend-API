package in.mnp200002.contactsapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mnp200002.contactsapi.model.Address;
import in.mnp200002.contactsapi.model.AddressDTO;
import in.mnp200002.contactsapi.repository.AddressRepository;

@Service
public class AddressService implements AddressServiceInterface {
	
	public final AddressRepository addressRepository;
	
	@Autowired
	public AddressService(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}
	
//	@Override
//	public Optional<Address> getAddress(Integer id, Integer flag) {
//		List<Address> address = addressRepository.findAddressByContact_id(id);
//		Address result = null;
//		for(int i=0; i<address.size(); i++) {
//			if(address.get(i).getAddress_type().equals("home") && flag == 0) result = address.get(i);
//			if(address.get(i).getAddress_type().equals("work") && flag == 1) result = address.get(i);
//		}
//		return Optional.ofNullable(result);
//	}
	
	@Override
	public List<Address> getAddress(Integer id) {
		return addressRepository.findAddressByContact_id(id);
	}

	public void addAddress(List<AddressDTO> addressDTO, Integer contactId) {
		
		
		for(int i=0; i<addressDTO.size(); i++) {
			Address address = new Address();
			address.setContact_id(contactId);
			address.setAddress_type(addressDTO.get(i).getAddress_type());
			address.setCity(addressDTO.get(i).getCity());
			address.setAddress(addressDTO.get(i).getAddress());
			address.setState(addressDTO.get(i).getState());
			address.setZip(addressDTO.get(i).getZip());
			addressRepository.save(address);
		}
	}

	public void updateAddress(List<AddressDTO> addressDTO, Integer contact_id) {
		
		List<Address> existingAddress = addressRepository.findAddressByContact_id(contact_id);
		for(int i=0; i<addressDTO.size(); i++) {
			existingAddress.get(i).setAddress(addressDTO.get(i).getAddress());
			existingAddress.get(i).setAddress_type(addressDTO.get(i).getAddress_type());
			existingAddress.get(i).setCity(addressDTO.get(i).getCity());
			existingAddress.get(i).setState(addressDTO.get(i).getState());
			existingAddress.get(i).setZip(addressDTO.get(i).getZip());
			
			addressRepository.save(existingAddress.get(i));
		}
		
	}

	public void deleteAddress(Integer contact_id) {
		addressRepository.deleteAddressByContact_id(contact_id);	
	}
}
