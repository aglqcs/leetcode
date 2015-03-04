package leetcode;

public class LCP {
	public static String longestCommonPrefix(String[] strs) {
        String ret = new String("");
        if(strs == null || strs.length == 0) return ret;
        for(int i =0 ;i < strs[0].length();i ++){
        	char k = strs[0].charAt(i);
        	boolean match = true;
        	for(int j = 1;j < strs.length; j ++){
        	    if( !(i < strs[j].length()) ){
        	        match = false;
        	        break;
        	    }
        		if(strs[j].charAt(i) != k){
        			match = false;
        			break;
        		}
        	}
        	if( !match ){
        		break;
        	}
        	else{
        		ret += k;
        	}
        }
        return ret;
    }
	 public static void main(String []args){
		 String a[] = new String[4];
		 a[0] = "abcsajl;";
		 a[1]= "abcsajsdl;";
		 a[2]= "abcsajlw;";
		 a[3]= "abcsajl;qq";
	 System.out.println(longestCommonPrefix(a));
	 }
}
