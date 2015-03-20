package leetcode;

public class rotate_right {
	public static ListNode rotateRight(ListNode head, int k) {
		if(head == null) return head;
		int count = 0;
		for(ListNode p = head; p != null; p=p.next)
			count ++;
		k = k % count;
        ListNode p1,p2;
        p1 = p2 = head;
        for(int i= 0;i < k;i ++){
        	p2 = p2.next;
        }
        for(; p2.next != null; p1=p1.next,p2=p2.next);
        
        ListNode tail = p1;
        p2.next = head;
        head = tail.next;
        tail.next = null;
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
		a = rotateRight(a,6);
		p = a;
		while(p != null){
			System.out.print(p.val + " ");
			p=p.next;
		}
		System.out.print("\n");
	}
}
