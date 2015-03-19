package leetcode;

public class Merge_Two_Sorted_Lists {
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        ListNode newhead = new ListNode(0);
	        ListNode tail = newhead;
	        while( l1 != null || l2 != null){
	        	if(l1 == null){
	        		tail.next = l2;
	        	    break;
	        	    
	        	}else if( l2 == null){
	        		tail.next = l1;
	        	    break;
	        	    
	        	}
	        	else{
	        		if(l1.val < l2.val){
	        			tail.next = l1;
	        			tail = l1;
	        			l1 = l1.next;
	        			tail.next = null;
	        		}
	        		else{
	        			tail.next = l2;
	        			tail = l2;
	        			l2 = l2.next;
	        			tail.next = null;
	        		}
	        	}
	        }
	        return newhead.next;
	    }	
}
