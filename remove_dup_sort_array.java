package leetcode;

public class remove_dup_sort_array {
	  public static int removeDuplicates(int[] A) {
		  	if(A.length <= 1) return A.length;
		  	int current = A[0];
		  	int i,j;
		  	i = j = 1;
		  	while(j < A.length){
		  		if(A[j] == current){
		  			j ++;
		  		}
		  		else{
		  			A[i] = A[j];
		  			current = A[i];
		  			i ++;
		  			j ++;
		  		}
		  	}
	        
	        return i ;
	    }
	  public static void main(String []args){
		  int []a = {1,1,3,4,5,5,6};
		 System.out.println("heiehi" + removeDuplicates(a));
		//  int n = removeDuplicates(a);
		  for(int i = 0;i < a.length;i ++){
			  System.out.print(a[i] +  " ");
		  }
	  }
}
