package leetcode;
import java.io.*;
import java.util.Scanner;
/*
public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s;
    while ((s = in.readLine()) != null) {
      System.out.println(s);
    }
  }
  */
public class watson {
	 public static void main(String[] args) throws IOException {
		 Scanner scanner = new Scanner(System.in);
		 String line = scanner.nextLine();
		 String []input = line.split(" ");
		 int n,p,q;
		 String wat	= "WAT";
		 String son = "SON";
		 n = Integer.parseInt(input[0]);
		 p = Integer.parseInt(input[1]);
		 q = Integer.parseInt(input[2]);
		 for(int i = 1;i <= n;i ++){
			 String out = new String();
			 boolean mark = false;
			 if(i % p == 0 && !contain(i,p)){
				 out += wat;
				 mark = true;
			 }
			 if(i % q == 0 && !contain(i,q)){
				 out += son;
				 mark = true;
			 }
			 if( !mark ){
				 out += String.valueOf(i);
			 }
			 System.out.print(out);
			 if(i != n){
				 System.out.print(" ");
			 }
		 }
		 System.out.println();
	 }
	 public static boolean contain(int i,int x){
		 while(i > 0){
			 int k = i % 10;
			 if(k== x) return true;
			 else{
				 i = (i - i % 10) / 10;
			 }
		 }
		 return false;
	 }
}
