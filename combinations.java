package leetcode;

import java.util.LinkedList;
import java.util.List;

public class combinations {
	 public static List<List<Integer>> combine(int n, int k) {
		 	List<List<Integer>> ret = new LinkedList<List<Integer>>();
		 	if(n <= 0||n < k)
		 		return ret;
		 	for(int i = 1;i <= n;i ++){
		 		LinkedList<Integer> l = new LinkedList<Integer>();
		 		rec(i,n,k,l,ret);
	    	}
		 	return ret;
	 }
	 public static void rec(int current, int n,int k, List l,List<List<Integer>> ret){
		 l.add(current);
		 if(l.size() == k){
			 ret.add(l);
			 return;
		 }
		 for(int i = current + 1;i <= n;i ++){
			 LinkedList<Integer> p = new LinkedList<Integer>(l);
			 rec(i,n,k,p,ret);
		 }
	 }
	 public static void main(String[] args){
		 System.out.println(combine(4,2));
	 }
}
