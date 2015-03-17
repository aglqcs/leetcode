package leetcode;

public class Reverse_Words_in_a_String {
	public static String reverseWords(String s) {
        s = s.trim();
        s = s.replaceAll(" +", " ");
        String temp[] = s.split(" ");
        for(int i = 0;i < temp.length / 2; i ++){
        	String t = temp[i];
        	temp[i] = temp[temp.length - 1 - i];
        	temp[temp.length - 1 - i] = t;
        }
        String res = new String();
        for(int i = 0; i < temp.length;i ++){
        	res += temp[i];
        	if(i != temp.length - 1){
        		res+=" ";
        	}
        }
        return res;
    }
	public static void main(String[] args){
		System.out.println(reverseWords("  sky is blue  "));
	}
}
