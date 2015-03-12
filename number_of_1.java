package leetcode;

public class number_of_1 {
	 public static int hammingWeight(int n) {
		 int ret = 0;
		 int count = 0;
		 while(n != 0 && count ++ < 32){
			 if((n & 1) == 1) ret ++;
			 n = n >> 1;
		 }
		 return ret;
	  }
	 public static void main(String[] args){
		 System.out.println(hammingWeight(11));
	 }
}
