package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import lambda.AppleFilter.Apple;

public class AppleFilter {
	public static void main(String[] args) {
		List<Apple> inventory=Arrays.asList(new Apple(80,"green"),new Apple(155,"green"), new Apple(120,"red"));
		Function<Apple,Integer> f=(Apple)->{return Apple.getWeight();};
		for(Apple apple : inventory)
			System.out.println(f.apply(apple));
		
	}
	
	public static class Apple{
		
	}
}
