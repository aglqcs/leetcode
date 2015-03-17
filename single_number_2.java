package leetcode;

public class single_number_2 {
	  public int singleNumber(int[] A) {
	        int result = 0;
	        int k = 0;
	        for(int i = 0;i < 32;i ++){
	            for(int j = 0;j < A.length;j ++){
	                int bit = (A[j] >> i )& 1;
	                k += bit;
	            }
	            k = k % 3;
	            result += ((k & 1)<< i );
	            k = 0;
	        }
	        return result;
	    }
}
