package leetcode;
// TODO
public class reverseKlist {
	public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode p =head;
        ListNode prev = null;
        for(int i = 0;i < k;i ++){
        	p = p.next;
        	prev = p;
        }
        prev.next = null;
        ListNode save = p.next;
		ListNode newhead = p;
		int reversed = 1;
		while(reversed ++ != k){
			ListNode q = head;
			while( q != null){
				q = q.next;
				prev = q;
			} 
			prev.next = null;
			ListNode m = newhead;
			while( m != null)
				m=m.next;
			m.next = q;
		}
		ListNode m = newhead;
		while(m!=null)
			m=m.next;
		m.next= save;
		return newhead;
		
    }
	public static ListNode reverse(ListNode head){
		if(head == null || head.next == null){
			return head;
		}
		ListNode p,q;
		p = head;
		q = head.next;
		while(q != null){
			ListNode n;
			n = q.next;
			q.next = p;
			p = q;
			q = n;
		}
		head.next = null;
		head = p;
		return head;
	}
	public static void main(String []args){
		ListNode a = new ListNode(1);
		ListNode	b = new ListNode(2);
		ListNode	c = new ListNode(3);
		ListNode	d = new ListNode(4);
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
		
		//a = reverseKGroup(a,3);
		a = reverse(a);
		p = a;
		while(p != null){
			System.out.print(p.val + " ");
			p=p.next;
		}
		System.out.print("\n");
	}
}
