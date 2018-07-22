package instanceof_practice1;

public class InstanceofTest {
	public static void main(String[] args) {
		FireEngine fe=new FireEngine();
		Car ca=new Car();
		
		if(ca instanceof FireEngine){
			System.out.println("THis is a Fireengine instance");
		}
		
		if( fe instanceof Car){
			System.out.println("This is a Car instance");
		}
		
		if(fe instanceof Object){
			System.out.println("This is an Object instance.");
		}
		System.out.println(fe.getClass().getName()); //클래스 이름을 출력
	}
}

class Car{}
class FireEngine extends Car{}
