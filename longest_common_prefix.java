package leetcode;

public class longest_common_prefix {
	public static String longestCommonPrefix(String[] strs) {
        String ret = new String();
        if(strs == null || strs.length == 0) return ret;
        for(int i = 0;i < strs[0].length();i ++){
            char k = strs[0].charAt(i);
            for(int j = 1;j < strs.length;j ++){
                if(i > strs[j].length() - 1)
                    return ret;
                if ( strs[j].charAt(i) != k){
                    return ret;
                }
            }
            ret += k;
        }
        return ret;
    }
	public static void main(String[] args){
		String s[] = {"aa","a"};
		System.out.println(longestCommonPrefix(s));
	}
}
