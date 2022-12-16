package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contactService.Contact;
import contactService.ContactService;

class ContactServiceTest {

	// Test that a contact can be added to contactStorage
	@Test
	void testContactService() {
		
		ContactService contactService = new ContactService();
		Contact contact1 = new Contact("1", "juan", "pablo", "7021112222", "street");

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.addContact(contact1);
		});
		
		// Clear contact storage for next test.
		contactService.deleteAllContacts();

	}
	
	// Test for null contact addition
	@Test
	void testContactServiceStorageIsNull() {
		
		ContactService contactService = new ContactService();
		Contact contact1 = null;
				
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.addContact(contact1);
		});
		
		// Clear contact storage for next test.
		contactService.deleteAllContacts();
	}
	
	// Test for duplicate ID entries
	@Test
	void testContactServiceDuplicateEntry() {
		ContactService contactService = new ContactService();
		Contact contact1 = new Contact("2", "juan", "pablo", "7021112222", "street");
		Contact contact2 = new Contact("2", "juan", "pablo", "7021112222", "street");
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.addContact(contact1);
			contactService.addContact(contact2);
		});
		
		// Clear contact storage for next test.
		contactService.deleteAllContacts();
	}
	
	// Test deleting a contact
	@Test
	void testDeleteContactId( ) {
		ContactService contactService = new ContactService();
		Contact contact1 = new Contact("2", "juan", "pablo", "7021112222", "street");
		
		contactService.deleteContactId(contact1.getContactId());
	}
	
	// Test for update firstName
	@Test
	void testContactServiceFirstNameUpdate() {
		ContactService contactService = new ContactService();
		Contact contact1 = new Contact("3", "juan", "pablo", "7021112222", "street");
		
		ContactService.contactStorage.add(contact1);

		contactService.updateFirstNameAt("Alma", "3");
		
		// Clear contact storage for next test.
		contactService.deleteAllContacts();
	}
	
	// Test for update lastName
	@Test
	void testContactServiceLastNameUpdate() {
		ContactService contactService = new ContactService();
		Contact contact1 = new Contact("3", "juan", "Izquierdo", "7021112222", "street");
		
		ContactService.contactStorage.add(contact1);

		contactService.updateLastNameAt("Huck", "3");
		
		// Clear contact storage for next test.
		contactService.deleteAllContacts();
	}
	
	// Test for update phone
	@Test
	void testContactServicePhoneUpdate() {
		ContactService contactService = new ContactService();
		Contact contact1 = new Contact("3", "juan", "Izquierdo", "7021112222", "street");
		
		ContactService.contactStorage.add(contact1);

		contactService.updatePhoneAt("7023334444", "3");
		
		// Clear contact storage for next test.
		contactService.deleteAllContacts();
	}
	
	// Test for address update
	@Test
	void testContactServiceAdddressUpdate() {
		ContactService contactService = new ContactService();
		Contact contact1 = new Contact("3", "juan", "Izquierdo", "7021112222", "street");
		
		ContactService.contactStorage.add(contact1);

		contactService.updateAddressAt("Blvd", "3");
		
		// Clear contact storage for next test.
		contactService.deleteAllContacts();
	}

	//Testing tools and code.
	/*
		for (int i = 0; i < ContactService.contactStorage.size(); ++i) {
			System.out.println(ContactService.contactStorage.get(i).getContactId());
		}
	*/
}
