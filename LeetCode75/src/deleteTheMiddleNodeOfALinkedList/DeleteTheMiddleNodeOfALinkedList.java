package deleteTheMiddleNodeOfALinkedList;

public class DeleteTheMiddleNodeOfALinkedList {

	public static void main(String[] args) {
		DeleteTheMiddleNodeOfALinkedList p = new DeleteTheMiddleNodeOfALinkedList();
		ListNode head = new ListNode(1,new ListNode(3,new ListNode(4, 
				new ListNode(7, new ListNode(1,new ListNode(2,new ListNode(6,null)))))));
		p.deleteMiddle(head);
		ListNode currNode = head; 
	    
        System.out.print("LinkedList: "); 
    
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.val + " "); 
    
            // Go to next node 
            currNode = currNode.next; 
        }

	}
	
	public ListNode deleteMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode prevSlow=null;

        if(head.next==null){
            return head.next;
        }
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            prevSlow = slow;
            slow = slow.next;
        }

        prevSlow.next = slow.next;
        return head;
    }
}
class ListNode {
	 int val;
	 ListNode next;
	 ListNode() {}
	 ListNode(int val) { 
		 this.val = val; 
	 }
	 ListNode(int val, ListNode next) { 
		 this.val = val; this.next = next; 
	}
}
