package leetcode;

public class largest_number {
	public static String largestNumber(int[] num) {
        for(int i = 0;i < num.length;i ++){
        	for(int j = i + 1;j < num.length;j ++){
        		if( compare(num[i],num[j]) == -1){
        			int temp = num[i];
        			num[i]=num[j];
        			num[j]=temp;
        		}
        	}
        }
        String ret = new String();
        for(int p : num){
        	ret+=p;
        }
        while(ret.charAt(0) == '0' && ret.length() > 1){
        	ret = ret.substring(1);
        }
        return ret;
    }
	public static int compare(int A,int B){
		String a = String.valueOf(A);
		String b = String.valueOf(B);
		String a_b = a + b;
		String b_a = b + a;
		if (a_b.length() < b_a.length()) return -1;
		else if(a_b.length() > b_a.length()) return 1;
		else{
			for(int i = 0;i < a_b.length();i ++){
				int t1 =(int)(a_b.charAt(i) - '0');
				int t2 =(int)(b_a.charAt(i) - '0');
				if(t1 > t2) return 1;
				else if(t1 < t2) return -1;
			}
		}
		return 0;
	}

	public static void main(String []args){
		int[] a = {3, 30, 34, 5, 9};
		System.out.println(largestNumber(a));
	}
}
