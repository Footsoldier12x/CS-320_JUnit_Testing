package contactService;

public class Contact {
	
	// contact class variable initialization
	private String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	// Contact class constructor with all variables
	public Contact(String contactId, String firstName, String lastName, String phone, String address) {
		if (contactId == null || contactId.length()>10) {
			throw new IllegalArgumentException("Invalid id");
		}
		if (firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid firstName");
		}
		if (lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid lastName");
		}
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone");
		}
		if (address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		// if all parameters above are met, set each object variable to the constructor's input values.
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
		
		
	}
	
	// return id
	public String getContactId() {
		return contactId;
	}
	
	 // return firstName
	public String getFirstName() {
		return firstName;
	}
	
	// return lastName
	public String getLastName() {
		return lastName;
	}
	
	// return phone
	public String getPhone() {
		return phone;
	}
	
	// return address
	public String getAddress() {
		return address;
	}
	

}
