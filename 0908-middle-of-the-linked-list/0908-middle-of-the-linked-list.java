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
    public ListNode middleNode(ListNode head) {
        /** story time 
        check if the list is empty or there is only 1 node , if true return head, if false make a count variable and 
        count the number of nodes then if number of nodes is even make it count/2 and if it is odd make it count+1)/2
        then iterate till count-1 and make count as head return count  
        if(head.next==null||head==null){
            return head;
        }
        int count =0;
        ListNode temp = head;
        while(temp.next!=null){
            temp = temp.next;
            count++;
        }
        if(count%2==0){
            count = count/2;
        }else{
            count = (count+1)/2;
        }
        for(int i=0; i<count; i++){
            head= head.next;
        }
        return head;*/

        //two pointer method (fast and slow pointers)

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}