package lab10;

public class Person {
	private String name;
	private String phoneNumber;
	public Person(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	

	public String toString(){
		return "("+name+", "+phoneNumber+")";
	}
}
