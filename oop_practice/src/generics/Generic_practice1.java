package generics;

import java.util.ArrayList;

import javax.swing.Box;

public class Generic_practice1<T> {
	ArrayList<T> list=new ArrayList<T>();
	
	void add(T item){list.add(item);}
	T get(int i){return list.get(i);}
	ArrayList<T> getList(){return list;}
	int size(){return list.size();}
	
	public static void main(String[] args) {
		
	}
}


