package leetcode;

import java.util.ArrayList;
import java.util.List;

public class pascal_triangle {
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
		for(int i = 1;i <= numRows; i ++){
			List<Integer>a = new ArrayList<Integer>();
			if(i == 1){
				a.add(1);
				ret.add(a);
			}
			else if(i == 2){
				a.add(1);
				a.add(1);
				ret.add(a);
			}
			else{
				// start from i == 3
				int pos = i - 2;
				ArrayList<Integer> p = (ArrayList<Integer>) ret.get(pos);
				for(int j = 0;j < i;j ++){
					if(j == 0) a.add(p.get(j));
					else if(j == i - 1) a.add(p.get(p.size()-1));
					else{
						int t = p.get(j) + p.get(j - 1);
						a.add(t);
					}
				}
				ret.add(a);
			}
			
		}
		return ret;
	}
	public static void main(String []args){
		System.out.println(generate(5));
	}
}	
