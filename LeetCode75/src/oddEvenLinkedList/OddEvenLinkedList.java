package oddEvenLinkedList;

public class OddEvenLinkedList {

	public static void main(String[] args) {
		OddEvenLinkedList p = new OddEvenLinkedList();
		ListNode head = new ListNode(1,new ListNode(2,new ListNode(3, 
				new ListNode(4,new ListNode(5,null)))));
		p.oddEvenList(head);
		ListNode currNode = head; 
	    
        System.out.print("LinkedList: "); 
        while (currNode != null) { 
            System.out.print(currNode.val + " "); 
            currNode = currNode.next; 
        }
	}
	
	public ListNode oddEvenList(ListNode head) {
        ListNode oddNode = null;
        ListNode oddNodeHead = null;
        ListNode currNode = head;
        ListNode prevNode = null;
        boolean isOdd = false;
        if(head==null)
            return head;
        while(currNode!=null){
            if(isOdd){
                if(oddNodeHead==null){
                    oddNodeHead = currNode;
                    oddNode = oddNodeHead;
                }else{
                    oddNode.next = currNode;
                    oddNode = oddNode.next;
                }
                prevNode.next = currNode.next;
                oddNode.next = null;
                currNode = prevNode.next;
                isOdd = false;
            }else{
                prevNode = currNode;
                currNode = currNode.next;
                isOdd = true;
            }
        }
            prevNode.next = oddNodeHead;
        return head;
    }
}
class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
