package reverseLinkedList;

public class ReverseLinkedList {

	ListNode start = null;
	
	public static void main(String[] args) {
		ReverseLinkedList p = new ReverseLinkedList();
		ListNode head = new ListNode(1,new ListNode(2,new ListNode(3, 
				new ListNode(4,new ListNode(5,null)))));
		ListNode currNode = p.reverseList(head); 
	    
        System.out.print("LinkedList: "); 
        while (currNode != null) { 
            System.out.print(currNode.val + " "); 
            currNode = currNode.next; 
        }

	}
	
	public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            start = head;
            return head;
        }
        if (head.next != null) {
            reverseList(head.next);
            ListNode node = head.next;
            node.next = head;
            head.next = null;
            node = node.next;
            return start;
        }
        return start;
    }

}

class ListNode {
	 int val;
	 ListNode next;
	 ListNode() {}
	 ListNode(int val) { this.val = val; }
	 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
