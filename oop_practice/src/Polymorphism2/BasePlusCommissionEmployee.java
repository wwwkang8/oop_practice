package Polymorphism2;

public class BasePlusCommissionEmployee extends SalariedEmployee {
	private double baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
			double weeklySalary, double baseSalary) throws IllegalAccessException {
		super(firstName, lastName, socialSecurityNumber, weeklySalary);
		
		if(baseSalary<0.0)
			throw new IllegalAccessException("Base salary must be >=0.0");
		
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	
	// SalariedEmployee가 추상메서드를 구현했기 때문에 더이상 추상 클래스가 아니다
	// 그래서 이 클래스는 추상 메서드를 구현할 필요 없다
	
}
