/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){//check if head is null or next node is null
            return head;
        }
        ListNode curr = head;//make a new node as current at head
        while(curr.next!=null){//run until curr becomes null
            if(curr.val==curr.next.val){//check if current val is equal to next node val
                ListNode currp2  = curr.next.next;//make a node after 1 node or at 2nd node
                curr.next = currp2;//link the current node to 2nd node
            }else{//if if is false
            curr = curr.next;//make next node as current
            }
        }
        return head;//return haed
    }
}