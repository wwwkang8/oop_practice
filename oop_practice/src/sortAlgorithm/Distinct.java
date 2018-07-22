package sortAlgorithm;

import java.util.HashMap;
import java.util.Iterator;

public class Distinct {
	public int solution(int[] A){
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<A.length; i++){
			int num=A[i];
			if(!map.containsKey(A[i])){
				map.put(num, num);
			}	
		}
		Iterator<Integer> it=map.keySet().iterator();
		int B = 0; int j=0;
		while(it.hasNext()){
			B=it.next();
			j++;
		}
		return B;
	}
	public static void main(String[] args) {
		Distinct d=new Distinct();
		int[] A={2,1,1,2,3,1};
		int []C=null;

		for(int i=0; i<C.length; i++){
			System.out.println(C[i]);
		}
	}
}
