package payment;

import Polymorphism2.SalariedEmployee;

public class PayableInterfaceTest {
	public static void main(String[] args) {
		Payable[] payableObjects=new Payable[4];
		
		//populated array with objects that implement payable
		payableObjects[0]=new Invoice("01234","seat",2,375.00);
		payableObjects[1]=new Invoice("56789","tire",4,79.00);
		payableObjects[2]=new SalariedEmployee("John","Smith","1111-11-111",800.00);
		payableObjects[3]=new SalariedEmployee("Lisa","Barnes","888-888-88",1200.00);
		
		System.out.println("invoice and employee processed polymorphically:");
		
		
		for(Payable currentPayable:payableObjects){
			System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(),"payment du",currentPayable.getPaymentAmount());
		}
		
	}
}
