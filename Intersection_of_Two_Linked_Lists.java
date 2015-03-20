package leetcode;

public class Intersection_of_Two_Linked_Lists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int la = length(headA);
        int lb = length(headB);
        if( la < lb) return getIntersectionNode(headB,headA);
        ListNode p = headA;
        for(int i = 0;i < la - lb; i ++){
            p = p.next;
        }
        ListNode q = headB;
        for(int i = 0;i < lb;i ++){
            if(p.val == q.val) return p;
            else{
                p = p.next;
                q = q.next;
            }
        }
      
        return null;
    }
    public static int length(ListNode head){
        if(head == null) return 0;
        int count = 0;
        ListNode p = head;
        while(p != null){
            count ++;
            p = p.next;
        }
        return count;
    }
}
