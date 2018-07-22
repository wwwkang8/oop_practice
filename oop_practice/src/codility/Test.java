package codility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Test {
	
	int bgap=0;
	int one;
	int zero;
	    public static int solution(int A) {
	    	Stack<Integer> stack=new Stack<Integer>();
	    	while(A>1){
	    		if(A%2!=0){
		    		stack.add(A%2);
		    		A=A/2;
		    	}else{
		    		stack.add(A%2);
		    		A=A/2;
		    	}
	    	}
	    	stack.add(1);
	    	List arr=new ArrayList();
	    	for(int i=0; i<stack.size(); i++){
	    		int b=stack.pop();
	    		arr.add(b);
	    		System.out.println("팝된 숫자 : "+b);
	    		
	    	}
	    
	    	Iterator it=arr.iterator();
	    	while(it.hasNext()){
	    		System.out.println(it.next());
	    	}
	    	/*while(it.hasNext()){
	    		if((int)it.next()==1){
	    			one=one+1;
	    			if(one==2){
	    				one=0;
	    				
	    			}
	    		}
	    	}*/
	    	
	    	
	    	return 0;
	    }
	    
	    public static void main(String[] args) {
			int a=200;
			solution(a);
		}
}
