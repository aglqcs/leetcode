package leetcode;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class watson_2 {
	public static class record{
		public String name;
		public int generation;
		public record(String n,int g){
			name = n;
			generation = g;
		}
	}
	public static void insert(ArrayList<String> output,String name){
		for(int i = 0; i < output.size();i ++){
			if(name.compareTo(output.get(i)) < 0){
				output.add(i, name);
				return;
			}
		}
		output.add(name);
		return;
	}
	public static int get_gen(ArrayList<record> list,String name){
		for(int i = 0;i < list.size();i ++){
			if(0 == name.compareToIgnoreCase(list.get(i).name)){
				return list.get(i).generation;
			}
		}
		return -1;
	}
	public static void main(String[] args) throws IOException {
		 Scanner scanner = new Scanner(System.in);
		 String line = scanner.nextLine();
		 String []input = line.split(",");
		 int gen = Integer.parseInt(input[input.length - 1]);
		 ArrayList<record> list = new ArrayList<record>();
		 for(int i = 0;i < input.length - 1;i ++){
			 String []pair = input[i].split("->");
			 
			 int gen1 = get_gen(list,pair[0]);
			 int gen2 = get_gen(list,pair[1]);
			 if(gen1 == -1 && gen2 == -1){
				 list.add(new record(pair[0],1));
				 list.add(new record(pair[1],2));
			 }
			 else if( gen1 != -1 && gen2 == -1){
				 list.add(new record(pair[1],gen1 + 1));
			 }
			 else if( gen1 == -1 && gen2 != -1){
				 list.add(new record(pair[0],gen2 - 1));
			 }
		 }
		 ArrayList<String> output = new ArrayList<String>();
		 for(int i = 0;i < list.size();i ++){
			 if( list.get(i).generation == gen){
				 insert(output,list.get(i).name);
			 }
		 }
		 for(int i = 0;i < output.size();i ++){
			 System.out.print(output.get(i));
			 if(i != output.size() - 1){
				 System.out.print(",");
			 }
		 }
		 System.out.println();
	}
}
