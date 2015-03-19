package leetcode;

import java.util.LinkedList;
import java.util.List;

public class pascal_triangle_2 {
	 public static List<Integer> getRow(int rowIndex) {
		 LinkedList<Integer> ret = new LinkedList<Integer>();
		 if(rowIndex < 0) return ret;
		 int row[] = new int[rowIndex + 1];
		 row[0] = 1;
		 for(int i = 1;i < rowIndex + 1;i ++){
			 row[0] = 1;
			 row[i] = 1;
			 int last = 1;
			 for(int j = 1;j < i;j ++){
				 row[j] = last + row[j];
				 last = row[j] - last;
			 }
		 }
		 for(int i = 0;i < rowIndex + 1;i ++){
			 ret.add(row[i]);
		 }
		 return ret;
	 }
	 public static void main(String[] args){
		 System.out.println(getRow(4));
	 }
}
