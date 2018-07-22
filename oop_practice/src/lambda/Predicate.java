package lambda;

public class Predicate {
	public static void main(String[] args) {
		Predicate<String> isEmptyStr=s->s.length()==0;
		String s="";
		
		if(isEmpty.test(s))
			System.out.println("This is an empty String");
	}
}
