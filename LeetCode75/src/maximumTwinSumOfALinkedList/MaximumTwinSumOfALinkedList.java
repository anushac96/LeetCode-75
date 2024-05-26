package maximumTwinSumOfALinkedList;

import java.util.*;

public class MaximumTwinSumOfALinkedList {

	public static void main(String[] args) {
		MaximumTwinSumOfALinkedList p = new MaximumTwinSumOfALinkedList();
		ListNode head = new ListNode(5,new ListNode(4,new ListNode(2, 
				new ListNode(1,null))));
		System.out.println(p.pairSum(head)); 
	    
        

	}
	
	public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        int mid = list.size()/2;
        int maxi = 0;
        for(int i =0;i<mid;i++){
            maxi = Math.max(maxi,list.get(i)+list.get(list.size()-1-i));
        }

        return maxi;
    }

}

class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
