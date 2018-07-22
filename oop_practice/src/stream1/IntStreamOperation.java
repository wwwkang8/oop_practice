package stream1;

import java.util.stream.IntStream;

public class IntStreamOperation {
	public static void main(String[] args) {
		int[] values={3,10,6,1,4,8,2,5,9,7};
		
		//display original values
		System.out.println("Original values: ");
		IntStream.of(values).forEach(value->System.out.printf("%d ",value));
		System.out.println();
		
		System.out.printf("%nCount: %d%n",IntStream.of(values).count());
		System.out.printf("Min: %d%n",IntStream.of(values).min().getAsInt());
		System.out.printf("Sum: %d%n",IntStream.of(values).sum());
		System.out.printf("Average: %.2f%n",IntStream.of(values).average().getAsDouble());
		
		// sum of values with reduce method
		System.out.printf("%nSum via reduce method: %d%n",IntStream.of(values).reduce(0,(x,y)->x+y));
		
		//sum of squares of values with reduce method
		System.out.printf("sum of squares via reduce method: %d%n",IntStream.of(values).reduce(0,(x,y)->x+y*y));
		System.out.printf("Product vio reduce method: %d%n",IntStream.of(values).reduce(1,(x,y)->x*y));
		
		
		
		
	
	
	}
}
