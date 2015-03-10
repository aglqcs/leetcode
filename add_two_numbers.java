package leetcode;

public class add_two_numbers {
	 public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 if(l1 == null) return l2;
		 if(l2 == null) return l1;
		 
		 boolean cont = true;
		 int carry = 0;
		 ListNode p = l1;
		 ListNode q = l2;
		 ListNode newhead = null;
		 ListNode cur = null;
		 while(cont){
			 int sum = p.val + q.val + carry;
			 if(sum >= 10){
				 carry = 1;
				 sum -= 10;
			 }
			 else{
				 carry = 0;
			 }
			 if(newhead == null){
				 newhead = new ListNode(sum);
				 cur = newhead;
			 }
			 else{
				 ListNode m = new ListNode(sum);
				 cur.next = m;
				 cur = m;
			 }
			 p = p.next;
			 q = q.next;
			 if(p == null || q == null){
				 cont = false;
			 }
		 }
		 if(p == null){
			 cur.next = q;
		 }
		 else{
			 cur.next = p;
		 }
		 ListNode k = cur.next;
		 while(carry == 1){
			 if(k == null){
				 k = new ListNode(1);
				 cur.next = k;
				 carry = 0;
			 }
			 else{
				
				 k.val ++;
	
				 if(k.val >= 10){
					 carry = 1;
					 k.val -= 10;
				 }
				 else{
					 carry = 0;
				 }
				 k = k.next;
				 cur = cur.next;
			 }
		 }
		 return newhead;
	 }
	 public static void main(String[] args){
		 ListNode a1,a2,a3;
		 ListNode b1,b2,b3;
		 a1 = new ListNode(1);
		 a2 = new ListNode(4);
		 a3 = new ListNode(3);
		// a1.next = a2;
		 a2.next = a3;
		 b1 = new ListNode(9);
		 b2 = new ListNode(9);
		 b3 = new ListNode(4);
		 b1.next = b2;
		 //b2.next = b3;
		 ListNode k = addTwoNumbers(a1, b1);
		 while(k!=null){
			 System.out.print(k.val+" ");
			 k=k.next;
		 }
	 }
}
