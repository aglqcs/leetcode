package leetcode;

import java.util.Arrays;

public class majority_element {
	  public int majorityElement(int[] num) {
	        if(num.length == 0 || num == null) return 0;
	        Arrays.sort(num);
	        return num[num.length/2];
	    }
}
