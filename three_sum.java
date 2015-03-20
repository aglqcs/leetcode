package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class three_sum {
	 public static List<List<Integer>> threeSum(int[] num) {
	        LinkedList<List<Integer>> ret = new  LinkedList<List<Integer>>();
	        if(num == null || num.length < 3) return ret;
	        
	        Arrays.sort(num);
	        int a,b,c;
	        for(int i = 0;i < num.length;i ++){
	            int j,k;
	            j = i + 1;
	            k = num.length - 1;
	            while( j < k){
	                if(num[i] + num[j] + num[k] == 0){
	                    LinkedList<Integer> current = new LinkedList<Integer>();
	                    current.add(num[i]);
	                    current.add(num[j]);
	                    current.add(num[k]);
	                    if( !ret.contains(current) ){
	                        ret.add(current);
	                    } 
	                    j ++;
	                    k --;
	                }
	                else if(num[i] + num[j] + num[k] > 0){
	                    k --;
	                }
	                else{
	                    j ++;
	                }
	            }
	        }
	        return ret;
	    }
	public static void main(String[] args){
		int []a = {7,-1,14,-12,-8,7,2,-15,8,8,-8,-14,-4,-5,7,9,11,-4,-15,-6,1,-14,4,3,10,-5,2,1,6,11,2,-2,-5,-7,-6,2,-15,11,-6,8,-4,2,1,-1,4,-6,-15,1,5,-15,10,14,9,-8,-6,4,-6,11,12,-15,7,-1,-9,9,-1,0,-4,-1,-12,-2,14,-9,7,0,-3,-4,1,-2,12,14,-10,0,5,14,-1,14,3,8,10,-8,8,-5,-2,6,-11,12,13,-7,-12,8,6,-13,14,-2,-5,-11,1,3,-6};
		System.out.println(threeSum(a));
	}
}
