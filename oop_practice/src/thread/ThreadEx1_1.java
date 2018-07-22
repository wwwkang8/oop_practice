package thread;

public class ThreadEx1_1 extends Thread {
	public void run(){
		for(int i=0; i<5; i++){
			//조상인 Thread의 getName()을 호출
			System.out.println(getName());
		}
	}
}


class ThreadEx1_2 implements Runnable{
	public void run(){
		for(int i=0; i<5; i++){
			//Thread.currentThread() - 현재 실행중인 Thread를 반환한다
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	
}