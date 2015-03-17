package leetcode;

public class delete_all_dup_link {
	 public static ListNode deleteDuplicates(ListNode head) {
	        if(head == null || head.next == null) return head;
		 	ListNode newhead = null;
		 	ListNode newtail = null;
	        int current = head.val;
	        ListNode p = head;
	        while( p != null){
	        	
	        	if(p.next == null){
	        		//last one
	        		if(newhead == null){
	        			newhead = p;
	        		}
	        		else{
	        			newtail.next = p;
	        		}
	        		break;
	        	}
	        	if(p.next.val == current){
	        		p = p.next;
	        	}
	        	else{
	        		ListNode nextp = p.next;
	        		current = nextp.val;
	        		if(newhead == null){
	        			newhead = p;
	        			newtail = newhead;
	        			newtail.next = null;
	        		}
	        		else{
	        			
	        			p.next = null;
	        			newtail.next = p;
	        			newtail = p;
	        			
	        		}
	        		p = nextp;
	        	}
	        }
	        return newhead;
	    }

	 public static void main(String[] args){

			ListNode a = new ListNode(1);
			ListNode	b = new ListNode(2);
			ListNode	c = new ListNode(3);
			ListNode	d = new ListNode(5);
			ListNode	e = new ListNode(5);
			a.next = b;
			b.next = c;
			c.next = d;
			d.next = e;
			ListNode p = a;
			while(p != null){
				System.out.print(p.val + " ");
				p = p.next;
			}
			System.out.print("\n");
			
			a = deleteDuplicates(a);
			
			p = a;
			while(p != null){
				System.out.print(p.val + " ");
				p=p.next;
			}
			System.out.print("\n");
		 
	 }
}
