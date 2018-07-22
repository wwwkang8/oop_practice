package stream3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Stream {
	public static void main(String[] args) {
		String [] strings=
			{"Red","orange","Yellow","green","Blue","indigo","Violet"};
		//display original strings
		System.out.printf("Original strings:%s%n",Arrays.asList(strings));
		
		//strings in uppercase
		System.out.printf("Strings in uppercase: %s%n", Arrays.stream(strings).map(String::toUpperCase).collect(Collectors.toList()));
		
		
		System.out.printf("strings greater than m sorted ascending: %s%n",Arrays.stream(strings).filter(s->s.compareToIgnoreCase("n")<0).sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList()));
		
	}
}
