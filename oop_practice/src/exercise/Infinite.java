package exercise;

public class Infinite {
	public static void main(String[] argv) {
		int total = 0;
		for( int i=1; i<=5; i++ ) {
			for( int j=1; j<=i; i++ ) {
				System.out.println( total );
			total ++;
		}
		}
		
		}
}
