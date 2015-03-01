package leetcode;

public class removeNthFromEnd{
	public static ListNode removeNthFromEnd(ListNode head, int n){
		ListNode first = head;
		ListNode second = head;
		ListNode prev= null;
		for(int i = 0;i < n;i ++){
			first = first.next;
		}
		if(first == null){
			head = head.next;
			return head;
		}
		while(first !=null){
			first = first.next;
			second = second.next;
			prev = prev==null ? head : prev.next;
		}
	
		prev.next = second.next;
		return head;
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
		
		a = removeNthFromEnd(a,5);
		
		p = a;
		while(p != null){
			System.out.print(p.val + " ");
			p=p.next;
		}
		System.out.print("\n");
	}
}
