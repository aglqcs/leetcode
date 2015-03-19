package leetcode;

import java.util.LinkedList;
import java.util.List;

public class Gray_code {
	  public static int reverse_bit(int x,int pos){
		  int y;
		  if( ((x >> pos) & 1) == 1){
			  int dif = ~(1 << pos);
			  y = x & dif;
		  }
		  else{
			  int dif = 1 << pos;
			  y = x | dif;
		  }
		  return y;
	  }
	public static List<Integer> grayCode(int n) {
		LinkedList<Integer> result = new LinkedList<Integer>();
		int start = 0;
		boolean cont = true;
		while( cont ){
			cont = false;
			int next = 0;
			for(int i = 0;i < n;i ++){
				next = reverse_bit(start,i);
				if( !result.contains(next) ){
					cont = true;
					break;
				}
			}
			result.add(start);
			start = next;
		}
		return result;
	}
	  public static void main(String[] args){
		  System.out.println(grayCode(3));
	  }
}
