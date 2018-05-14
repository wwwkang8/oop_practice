package lab10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PhoneBook {
	private HashMap<String, String> phoneBook;

	//phoneBook constructor
	public PhoneBook() {
		super();
	}
	
	public Boolean add(String name, String phoneNumber){
		if(phoneBook.containsKey(name)){
			return false;
		}else{
			phoneBook.put(name, phoneNumber);
			return true;
		}
	}
	
	public Boolean delete(String name){
		if(phoneBook.containsKey(name)){
			phoneBook.remove(name);
			return true;
		}else{
			return false;
		}
	}
	
	public Set<Person> list(){
		HashSet<Person> personSet=new HashSet<Person>();
		Set<String> keys=phoneBook.keySet();
		Iterator it=keys.iterator();
		while(it.hasNext()){
		//	personSet.add(,it.next());
		}
	}
	
}






























