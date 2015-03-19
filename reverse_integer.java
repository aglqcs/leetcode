package leetcode;

public class reverse_integer {
	 public static int get_bit(int n,int pos){
	        // pos = 0,1,2,3 ... ,31
	        return (n >> pos) & 1;
	    }
	    public static int set_bit(int n,int bit,int pos){
	        if( get_bit(n,pos) == 0 ){
	            if(bit == 0){
	                return n;
	            }
	            else{
	                return n | (1 << pos);
	            }
	        }
	        else{
	            if(bit == 1){
	                return n;
	            }
	            else{
	                return n & ~(1<<pos);
	            }
	        }
	    }
	    public static int reverseBits(int n) {
	        for(int i = 0;i < 16;i ++){
	        	
	            int b1 = get_bit(n,i);
	            int b2 = get_bit(n,31 - i);
	            System.out.println(b1 + " " + b2);
	            n = set_bit(n,b1,31-i);
	            n = set_bit(n,b2,i);
	        }
	        return n;
	    }
	    public static void main(String[] args){
	    	System.out.println(reverseBits(1));
	    }
}
