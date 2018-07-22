package sortAlgorithm;

public class SortAlgo {
	
	public int solution(int list[], int n){
		int i,j,key;
		for(i=1; i<n; i++){
			key=list[i];
			for(j=i-1; j>=0&&list[j]>key; j--){
				list[j+1]=list[j];
			}
			list[j+1]=key;
		}
		int lastIdx=list.length-1;
		int answer=list[lastIdx]*list[lastIdx-1]*list[lastIdx-2];
		return answer;
	}
	
	public static void main(String[] args) {
		SortAlgo salgo=new SortAlgo();
		int [] A={-3,1,2,-2,5,6};
		int result=salgo.solution(A, A.length);
		System.out.println("정답 : "+result);
	}
}
