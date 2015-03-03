package leetcode;

public class reorder_list {
	public static void reorderList(ListNode head) {
		if(head == null || head.next == null) 
			return;
        ListNode mid;
        ListNode fast;
        int count = 0;
        mid = fast = head;
        while(fast != null && fast.next!=null){
        	mid = mid.next;
        	fast=fast.next.next;
        	count ++;
        }
        ListNode second;
        if(fast == null)
        	second = mid;
        else second = mid.next;
        
        second = reverselist(second);
        
        ListNode p = head;
        ListNode q = second;
        int t = 0;
        while(t++ < count){
        	ListNode nextp = p.next;
        	ListNode nextq = q.next;
        	q.next = p.next;
        	p.next = q;
        	p = nextp;
        	q = nextq;       	
        }
        mid.next =null;
	}
	public static ListNode reverselist(ListNode head){
		if(head == null) return head;
		if(head.next == null) return head;
		ListNode current = head;
		ListNode next = head.next;
		while(next != null){
			ListNode t = next.next;
			next.next =current;
			current = next;
			next = t;		
		}
		head.next=null;
		return current;
	}
public static void main(String[] args){
	
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
	
	reorderList(a);
	
	p = a;
	System.out.println("result:");
	while(p != null){
		System.out.print(p.val + " ");
		p=p.next;
	}
	System.out.print("\n");
}
}
