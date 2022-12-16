package contactService;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
	
	// contact service class storage initialization
	public static List<Contact> contactStorage = new ArrayList<>();
	
	// Contact Service constructor
	public ContactService() {
		
	}
	
	// Add contact to storage
	public void addContact(Contact newContact) {

		if (newContact == null) {
			throw new IllegalArgumentException("Invalid contact addition - null contact");
		}
		else if (contactStorage.isEmpty()) {
			contactStorage.add(0, newContact);
		}
		
		for (int i = 0; i < contactStorage.size(); ++i) {
			if (contactStorage.get(i).getContactId() == newContact.getContactId()) {
				throw new IllegalArgumentException("Duplicate contact addition");
			}
		}
		contactStorage.add(newContact);
	}
	
	// Delete contact from storage
	public void deleteContactId(String deleteContactId) {
		for (int i = 0; i < contactStorage.size(); ++i) {
			if (contactStorage.get(i).getContactId() == deleteContactId) {
				contactStorage.remove(i);
			}
		}

	}
	
	// Clears all contacts from contactStorage
	public void deleteAllContacts() {
		contactStorage.clear();
	}
	
	// Update contact firstName
	public void updateFirstNameAt(String newFirstName, String updateContactId) {
		for (int i = 0; i < contactStorage.size(); ++i) {
			if (contactStorage.get(i).getContactId() == updateContactId) {
				Contact newContact = new Contact(contactStorage.get(i).getContactId(),
												 newFirstName,
												 contactStorage.get(i).getLastName(),
												 contactStorage.get(i).getPhone(),
												 contactStorage.get(i).getAddress());
			
				contactStorage.set(i, newContact);
			}
		}
	}
	
	// Update contact lastName
	public void updateLastNameAt(String newLastName, String updateContactId) {
		for (int i = 0; i < contactStorage.size(); ++i) {
			if (contactStorage.get(i).getContactId() == updateContactId) {
				Contact newContact = new Contact(contactStorage.get(i).getContactId(),
												 contactStorage.get(i).getFirstName(),
												 newLastName,
												 contactStorage.get(i).getPhone(),
												 contactStorage.get(i).getAddress());
			
				contactStorage.set(i, newContact);
			}
		}
	}
	
	// Update contact phone
	public void updatePhoneAt(String newPhone, String updateContactId) {
		for (int i = 0; i < contactStorage.size(); ++i) {
			if (contactStorage.get(i).getContactId() == updateContactId) {
				Contact newContact = new Contact(contactStorage.get(i).getContactId(),
												 contactStorage.get(i).getFirstName(),
												 contactStorage.get(i).getLastName(),
												 newPhone,
												 contactStorage.get(i).getAddress());
			
				contactStorage.set(i, newContact);
			}
		}
	}
	
	// Update contact address
	public void updateAddressAt(String newAddress, String updateContactId) {
		for (int i = 0; i < contactStorage.size(); ++i) {
			if (contactStorage.get(i).getContactId() == updateContactId) {
				Contact newContact = new Contact(contactStorage.get(i).getContactId(),
												 contactStorage.get(i).getFirstName(),
												 contactStorage.get(i).getLastName(),
												 contactStorage.get(i).getPhone(),
												 newAddress);
			
				contactStorage.set(i, newContact);
			}
		}
	}
	

}
