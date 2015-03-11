package leetcode;

public class trailing_zeros {
	public static int trailingZeroes(int n) {
	    if(n < 5) return 0;
	    else return n/5 + trailingZeroes(n/5);
	}
	public static void main(String []args){
		System.out.println(trailingZeroes(2147483647));
	}
}
