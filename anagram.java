package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class anagram {
	public static void main(String[] args){
		String strs[] = {"ray","cod","abe","ned","arc","jar","owl","pop","paw","sky","yup","fed","jul","woo","ado","why","ben","mys","den","dem","fat","you","eon","sui","oct","asp","ago","lea","sow","hus","fee","yup","eve","red","flo","ids","tic","pup","hag","ito","zoo"};
		List<String> j = anagrams(strs);
		System.out.println(j);
	}
	 public static List<String> anagrams(String[] strs) {
		 LinkedList<String> res = new LinkedList<String>();
		 if(strs.length == 0 || strs == null) return res;
		 HashMap<String,String> map = new HashMap<String,String>();
		 for(int i = 0;i < strs.length;i ++){
			 char []k = strs[i].toCharArray();
			 Arrays.sort(k);
			 String sorted = new String(k);
			 if(map.containsKey(sorted)){
				 String value = map.get(sorted);
				 value += " " + String.valueOf(i);
				 map.put(sorted, value);
			 }
			 else{
				 map.put(sorted, String.valueOf(i));
			 }
		 }
		 Iterator it = map.entrySet().iterator();
		 while(it.hasNext()){
			 Map.Entry pair = (Map.Entry)it.next();
			 String value = (String)pair.getValue();
			 if(value.contains(" ")){
				 String []index = value.split(" ");
				 for(int i= 0;i < index.length; i ++){
					 int k = Integer.parseInt(index[i]);
					 res.add(strs[k]);
				 }
			 }
		 }
		 return res;
	 }
}
