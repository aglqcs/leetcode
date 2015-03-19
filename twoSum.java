package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class twoSum {
	
		 public static int[] twoSum(int[] numbers, int target) {  
		        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();  
		        int n = numbers.length;  
		        int[] result = new int[2];  
		        for (int i = 0; i < numbers.length; i++)  
		        {  
		            if (map.containsKey(target - numbers[i]))  
		            {  
		                result[0] = map.get(target-numbers[i]) + 1;  
		                result[1] = i + 1;  
		                break;  
		            }  
		            else  
		            {  
		                map.put(numbers[i], i);  
		            }  
		        }  
		        return result;  
		          
		    }  
	 
	 public static void main(String []args){
		 int a[] = {3,2,4};
		 int ret[] = twoSum(a,6);
		 System.out.println(ret[0] + " " +ret[1]);
	 }
}
