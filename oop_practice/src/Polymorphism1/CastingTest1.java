package Polymorphism1;

public class CastingTest1 {
	public static void main(String[] args) {
		Car car=null;
		FireEngine fe=new FireEngine();
		FireEngine fe2=null;
		
		fe.water();
		car=fe;
		//car.water()  조상클래스의 타입으로 자식클래스 메서드 참조 못함
		fe2=(FireEngine) car;
		fe2.water();
	}
}


class Car{
	String color;
	int door;
	
	void drive(){
		System.out.println("drive, Brrrr");
	}
	
	void stop(){
		System.out.println("Stop!!");
	}
}

class FireEngine extends Car{
	void water(){
		System.out.println("water!!");
	}
}