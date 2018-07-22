package lab10;

import java.util.HashSet;
import java.util.Iterator;

public class TestDriver {
	public static void main(String[] args) {
		String[] names={
				"Lasandra Packer",
				"Oren Evan",
				"Danelle Wasko",
				"Rich Havel",
				"Kristle Woodruff",
				"Tara Witt",
				"Patti Kellner",
				"Thanh Bunkley",
				"Lorraine Skelly",
				"Lorraine Skelly"
		};
		String[] phoneNumbers={
				"(958) 416-6820",
				"(958) 416-6820",
				"(422) 559-3857",
				"(673) 509-8613",
				"(551) 981-6195",
				"(513) 781-8347",
				"(892) 408-6187",
				"(554) 452-6981",
				"(531) 558-3976",
				"(260) 206-2730"
		};
		
		String[] deleteNames = {
				"Lasandra Packer",
				"some name"
		};
		
		PhoneBook pb;
		pb=new PhoneBook();
		
		System.out.println("### Add information to the phone book");
		for(int i=0; i<names.length; i++){
			System.out.println(names[i]+","+phoneNumbers[i]);
			Boolean result=pb.add(names[i], phoneNumbers[i]);
			Person person=new Person(names[i], phoneNumbers[i]);
			if(!result){
				System.out.println("Add failure: Duplicate name or phone number:"+person.toString());
			}
		}
		System.out.println();
		
		
		System.out.println("### Delete information");
		for(int j=0; j<deleteNames.length; j++){
			Boolean deleteResult=pb.delete(names[j]);
			if(deleteResult){
				System.out.println("Delete failure - No such name:("+names[j]+")");
			}
		}
		System.out.println();
		
		System.out.println("### List of all the person objects in the phone book");
		HashSet<Person> personSet=(HashSet<Person>) pb.list();
		Iterator it=personSet.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
