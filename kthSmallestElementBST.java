// Time Complexity : O(N)  
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this: No

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
    int count;
    int result;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return result;
    }
    public void inorder(TreeNode root, int k){
        //base
        if(root == null) return;
        //logic
        inorder(root.left, k);
        count++;
        if(count == k){
            result = root.val;
            return;
        }
        inorder(root.right , k);
    }
}