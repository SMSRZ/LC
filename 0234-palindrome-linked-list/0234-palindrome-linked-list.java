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
    public boolean isPalindrome(ListNode head) {
        //this is the naive sol and this uses a stack to keep the tracks off all elements in a reverse order 
        // Stack<Integer> st = new Stack();
        // ListNode temp = head;
        // while(temp != null){
        //     st.push(temp.val);
        //     temp = temp.next;
        // }
        // temp = head ;
        // while(!st.isEmpty() && temp.next!=null){
        //     if(st.pop()!=temp.val) return false;
        //     temp = temp.next;
        // }
        // return true;
        //the correct approach would be Find the middle of linked list , the reverse the second half of the list and then compare 

        
        if (head == null || head.next == null) return true;

        // Step 1: Find middle
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        ListNode secondHalf = reverseList(slow.next);

        // Step 3: Compare
        ListNode firstHalf = head;
        ListNode temp = secondHalf;
        while (temp != null) {
            if (firstHalf.val != temp.val) return false;
            firstHalf = firstHalf.next;
            temp = temp.next;
        }

        return true;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}