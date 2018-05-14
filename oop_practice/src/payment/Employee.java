package payment;

public abstract class Employee implements Payable {
	
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	
	//costructor
	
	
	

	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	


	@Override
	public String toString() {
		return String.format("%s %s%nsocial security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
	}



	

}
