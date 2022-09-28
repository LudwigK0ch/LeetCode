/**
* Problem: 110. Balanced Binary Tree
* Difficulty: Easy
* Categories: Tree, Depth-First Search, Binary Tree
* Link: https://leetcode.com/problems/balanced-binary-tree
*/

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
    int diff = 0;
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return diff <= 1;
    }
    
    private int dfs(TreeNode node) {
        if(node == null){
            return 0;
        }
        
        int left = 1 + dfs(node.left);
        int right = 1 + dfs(node.right);
        
        diff = Math.max(diff, Math.abs(left - right));
        
        return Math.max(left, right);
    }
}