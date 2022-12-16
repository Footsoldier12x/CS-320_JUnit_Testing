package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contactService.Contact;

class ContactTest {
	
	// Test creating a contact object
	@Test
	void testContact() {
		Contact contact = new Contact("1", "juan", "pablo", "7021112222", "street");
		
		assertTrue(contact.getContactId().equals("1"));
		assertTrue(contact.getFirstName().equals("juan"));
		assertTrue(contact.getLastName().equals("pablo"));
		assertTrue(contact.getPhone().equals("7021112222"));
		assertTrue(contact.getAddress().equals("street"));
	}

	// Testing for id too long.
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890111", "juan", "pablo", "7021112222", "street");
		});
	}
	
	// Testing for id being null.
	@Test
	void testContactIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "juan", "pablo", "7021112222", "street");
		});
	}
	
	// Testing for firstName too long.
	@Test
	void testContactFirtsNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "juanPabloIzquierdo", "pablo", "7021112222", "street");
		});
	}
	
	// Testing for firstName being null.
	@Test
	void testContactFirtsNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", null, "pablo", "7021112222", "street");
		});
	}
	
	// Testing for lastName too long.
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "juan", "pabloIzquierdo", "7021112222", "street");
		});
	}
	
	// Testing for lastName being null.
	@Test
	void testContactLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "juan", null, "7021112222", "street");
		});
	}

	// Testing for phone too long.
	@Test
	void testContactPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "juan", "pablo", "702702702702", "street");
		});
	}
	
	// Testing for phone too short (Phone < 10)
	@Test
	void testContactPhoneTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "juan", "pablo", "702", "street");
		});
	}
	
	// Testing for phone is null.
	@Test
	void testContactPhoneIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "juan", "pablo", null, "street");
		});
	}
	
	// Testing for address too long.
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "juan", "pablo", "7021112222", "streetstreetstreetstreetstreetstreetstreet");
		});
	}
	
	// Testing for address being null.
	@Test
	void testContactAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "juan", "pablo", "7021112222", null);
		});
	}
}
