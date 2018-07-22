package super_practice2;

public class SuperTest2 {
	public static void main(String[] args) {
		Child c=new Child();
		c.method();
	}
}

class Parent{
	int x=10;
}

class Child extends Parent{
	int x=20;
	void method(){
		System.out.println("x="+x); // 20 자기자신의 x
		System.out.println("this.x="+this.x); // 20 자기자신 x
		System.out.println("super.x="+super.x); // 10 조상의 x
	}
}