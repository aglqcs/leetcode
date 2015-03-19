package leetcode;

public class Valid_Palindrome {
	public static boolean isPalindrome(String s) {
		if(s == null || s.length() == 0) return true;
        s = s.trim();
        s = s.replaceAll("[^a-zA-Z0-9]" , "");
        s = s.toLowerCase();
        char []k = s.toCharArray();
        System.out.println(s);
        for(int i = 0;i < k.length/2;i ++){
        	if(k[i] != k[k.length - i-1]) return false;
        }
        return true;
	}
	public static void main(String[] args){
		String k = "`l;`` 1o1 ??;l`";
		System.out.println(isPalindrome(k));
	}
}
