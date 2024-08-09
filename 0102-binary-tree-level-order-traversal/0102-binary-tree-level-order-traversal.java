/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null)return ans;

        q.add(root);
        while(q.size()!=0){
            int levels = q.size();
            List<Integer> sublevel = new ArrayList<>();
            for(int i=0;i<levels;i++){
                if(q.peek().left!=null){
                q.add(q.peek().left);
                }
                if(q.peek().right!=null){
                q.add(q.peek().right);
                }
                sublevel.add(q.remove().val);
            }
            ans.add(sublevel);
        }
        return ans;
    }
}/*
--Declare a Queue named q that will be used for level-by-level traversal of the binary tree.
--Declare a List of Lists of Integers named finalAns to store the final result.
--Check if the root of the binary tree is null. If it is, return the empty list of lists.
--Add the root node of the binary tree to the queue.
--While the queue is not empty, perform the following steps for each level of the tree:
--Get the size of the current level of the queue.
--Create a new list to store the values of the current level.
--For each node in the current level of the queue, add its left and right children (if they exist) to the end of the queue and add its value to the list of values for the current level.
--Add the list of values for the current level to the final result list.
--Return the final result list of lists of values for each level of the binary tree.



The difference between using LinkedList and ArrayList for the outer list in this code is related to their internal data structures and their performance characteristics.

LinkedList is implemented as a doubly linked list, where each node has a reference to its previous and next nodes. This makes it efficient to add or remove elements from the beginning or end of the list, but less efficient to access elements at arbitrary positions in the list. Therefore, using LinkedList for the outer list would be more efficient if we frequently add or remove elements from the beginning or end of the list.

List<List<Integer>> finalAns = new LinkedList<List<Integer>>();

On the other hand, ArrayList is implemented as a dynamic array, where elements are stored in a contiguous block of memory. This makes it efficient to access elements at arbitrary positions in the list, but less efficient to add or remove elements from the beginning or end of the list. Therefore, using ArrayList for the outer list would be more efficient if we frequently access elements at arbitrary positions in the list.

List<List<Integer>> finalAns = new ArrayList<List<Integer>>();

In the case of the provided code, since we only add elements to the end of the outer list and do not access elements at arbitrary positions, using either LinkedList or ArrayList for the outer list should produce the same results in terms of correctness. However, using ArrayList may be more efficient in terms of memory usage and performance, especially for larger input trees, because it avoids the overhead of maintaining the linked list structure.

Code
*/