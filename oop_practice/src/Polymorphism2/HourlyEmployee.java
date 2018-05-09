package Polymorphism2;

public class HourlyEmployee extends Employee{
	private double wage;
	private double hours;
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) throws IllegalAccessException {
		super(firstName, lastName, socialSecurityNumber);
		
		if(wage<0.0) 
			throw new IllegalAccessException("Hourly wage must be >=0.0");
		
		if((hours<0.0)||(hours>168.0))
			throw new IllegalAccessException("Hours worked must be >=0.0 and <=168.0");
		
		
		this.wage = wage;
		this.hours = hours;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	
	
	
	
}
