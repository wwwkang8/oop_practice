package waitNotifyThread;

import java.util.ArrayList;

public class ThreadWaitEx1 {
	public static void main(String[] args) throws InterruptedException {
		Table table=new Table();//여러 쓰레드가 공유하는 객체
		
		new Thread(new Cook(table),"COOK1").start();
		new Thread(new Customer(table,"donut"),"CUST1").start();
		new Thread(new Customer(table,"burger"),"CUST2").start();
		
		Thread.sleep(100);
		System.exit(0);
		
	}
}


class Customer implements Runnable{
	private Table table;
	private String food;
	public Customer(Table table, String food) {
		super();
		this.table = table;
		this.food = food;
	}
	
	public void run(){
		while(true){
			try{Thread.sleep(10);} catch(InterruptedException e){}
			String name=Thread.currentThread().getName();
			
			if(eatFood()){
				System.out.println(name+" ate a "+food);
			}else{
				System.out.println(name+" failed to eat. :(");
			}
			
		}//while
	}
	boolean eatFood(){return table.remove(food);}
}

class Cook implements Runnable{
	private Table table;
	
	Cook(Table table){this.table=table;}
	
	public void run(){
		while(true){
			//임의의 요리를 하나 선택해서 table에 추가한다
			int idx=(int)(Math.random()*table.dishNum());
			table.add(table.dishNames[idx]);
			try{Thread.sleep(1);}catch(InterruptedException e){}
		}
	}
	
}





























class Table{
	String [] dishNames={"donut","donut","burger"};//donut이 자주나옴
	
	private ArrayList<String> dishes=new ArrayList<>();
	final int MAX_FOOD=6;
	
	
	public void add(String dish){
		if(dishes.size()>=MAX_FOOD)
			return;
		dishes.add(dish);
		System.out.println("Dishes:"+dishes.toString());
	}
	
	public boolean remove(String dishName){
		//지정된 요리와 일치하는 요리를 테이블에서 제거한다
		for(int i=0; i<dishes.size(); i++){
			if(dishName.equals(dishes.get(i))){
				dishes.remove(i);
				return true;
			}
			return false;
		}
		
	}
	public int dishNum(){
		return dishNames.length;
	}
}





























