package addressBookFellowship;

//UC1-Contact Person Pojo class 
public class ContactPerson {

	String firstName;
	String lastName;
	String phone;
	String city;
	String state;
	String zip;
	String email;

	public ContactPerson(String firstName, String lastName, String phone, String city, String state, String zip,
			String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.email = email;
	}

	// Getter and setters to get and set person details
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "ContactPerson [firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + ", city="
				+ city + ", state=" + state + ", zip=" + zip + ", email=" + email + "]";
	}

}
