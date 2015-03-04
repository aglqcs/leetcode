package leetcode;

public class Climbing_Stairs {
	 public static int climbStairs(int n) {
	        int dp[] = new int[n + 1];
	        for(int i = 0;i < n + 1;i ++){
	        	if(i == 0) dp[i] = 0;
	        	else if(i == 1) dp[i] = 1;
	        	else if(i == 2) dp[i] = 2;
	        	else{
	        		dp[i] = dp[i-2] + dp[i-1];
	        	}
	        }
	        return dp[n];
	 }
	 public static void main(String[] args){
		 System.out.println(climbStairs(4));
	 }
}
