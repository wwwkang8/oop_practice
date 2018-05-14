package array;

public class Array {
	
	public void a(){
		b();
		this.b();
	}
	
	public void b(){
		Array.c();
	}
	
	public static void c(){
		
	}
	
	public static void main(String[] args) {
		
		Array arr=new Array();
		
		arr.a();
		arr.b();
		Array.c();
		
	}
}
