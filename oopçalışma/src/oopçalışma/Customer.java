package oopçalışma;

public class Customer {

	private String firstName;
	private String lastName;
	private String phoneNumber;

	public Customer(String firstName, String lastName, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;

	}

	public String getfirstName() {
		return firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public String getphoneNumber() {
		return phoneNumber;

	}
}
