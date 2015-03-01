package leetcode;

public class decode_ways {
	  public static int numDecodings(String s) {
		  int length = s.length();
		  if(length == 0) return 0;
		  if(length == 1 ) 
			  if( s.charAt(0) != '0') return 1;
			  else return 0;
		  
		  int []dp = new int[s.length() + 1];
		  dp[0] = 0;
		  if( s.charAt(0) != '0') dp[1] = 1;
		  int a1 =Integer.parseInt(s.substring(0,1));
		  int a2 = Integer.parseInt(s.substring(1,2));
		  dp[2] = compute_two(a1,a2);
		  for(int i = 3;i < s.length() + 1;i ++){
			  dp[i] = 0;
			  int ret = 0;
			  a1 = Integer.parseInt(s.substring(i-2,i-1));
			  a2 = Integer.parseInt(s.substring(i-1,i));
			  if(a2 != 0) dp[i] += dp[i - 1];
			  int two = 0;
			  if(a1 == 2 && a2 < 7 || a1 == 1) 
			  dp[i] += dp[i -2];
		  }
		  return dp[s.length()];
	  }
	  public static int compute_two(int a1,int a2){
		  int ret = 0;
		  if(a1!=0 && a2!= 0) ret ++;
		  if(a1 == 2 && a2 < 7 || a1 == 1) ret++;
		  return ret;
	  }
	  // 1 2 3,  12 3, 1 23, 
	  public static void main(String args[]){
		  System.out.println(numDecodings("110"));
	  }
}
