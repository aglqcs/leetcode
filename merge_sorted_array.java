package leetcode;

public class merge_sorted_array {
	 public static void merge(int A[], int m, int B[], int n) {
		 int i = m - 1;
			int j = n - 1;
			int k = m + n - 1;
		 
			while (k >= 0) {
				if (j < 0 || (i >= 0 && A[i] > B[j]))
					A[k--] = A[i--];
				else
					A[k--] = B[j--];
			}
	 }
	 public static void main(String[] args){
		 int a[] = {1,2,3,0,0,0};
		 int b[] = {2,5,6};
		 merge(a,3,b,3);
		 System.out.println(a);
		 }
}
