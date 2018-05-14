package list;

import java.util.ArrayList;
import java.util.Iterator;

public class List {
	public static void main(String[] args) {
		String[] colors={"MAGENTA","RED","WHITE","BLUE","CYAN"};
		ArrayList list=new ArrayList();
		
		for(String color:colors)
			list.add(color); //add color to end of list
		
		String[] removeColors={"RED","WHITE","BLUE"};
		ArrayList removeList=new ArrayList();
		
		for(String color : removeColors)
			removeList.add(color);
		
		System.out.println("ArrayList: ");
		for(int count=0; count<list.size(); count++)
			System.out.printf("%s ", list.get(count));
		removeColors(list,removeList);
		System.out.println("ArrayList: ");
		for(int count=0; count<list.size(); count++)
			System.out.printf("%s ", list.get(count));
	}

	private static void removeColors(ArrayList list, ArrayList removeList) {
		Iterator<String> iterator=list.iterator();
		
		while(iterator.hasNext()){
			if(removeList.contains(iterator.next()))
				iterator.remove();
		}
		
	}
}
