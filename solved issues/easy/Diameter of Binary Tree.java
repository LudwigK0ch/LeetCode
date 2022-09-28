/**
* Problem: 543. Diameter of Binary Tree
* Difficulty: Easy
* Categories: Tree, Depth-First Search, Binary Tree
* Link: https://leetcode.com/problems/diameter-of-binary-tree
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
    int maxDia = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        
        return maxDia;
    }
    
    private int dfs(TreeNode node){
        if(node == null){
            return -1;
        }
        
        int left = 1 + dfs(node.left);
        int right = 1 + dfs(node.right);
        
        maxDia = Math.max(maxDia, left + right);
        
        return Math.max(left, right);
    }
}