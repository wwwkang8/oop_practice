package lambda3;

@FunctionalInterface
interface MyFunction{
	void myMethod(); //public abstract void myMethod();
}

public class LambdaEx2 {
	public static void main(String[] args) {
		MyFunction f=()->{};//MyFunction f=(MyFunction)(()->{})
		Object obj=(MyFunction)(()->{}); //object 타입으로 변환이 생략됨
		String str=((Object)(MyFunction)(()->{})).toString();
		
		System.out.println(f);
		System.out.println(obj);
		System.out.println(str);
		
		//System.out.println(()->{});//error 람다식은 오브젝트 타입으로 형변환 아됨
		System.out.println((MyFunction)()->{});
		System.out.println(((Object)(MyFunction)(()->{})).toString());
	}
}
