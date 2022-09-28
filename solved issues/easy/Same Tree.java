/**
* Problem: 100. Same Tree
* Difficulty: Easy
* Categories: Tree, Depth-First Search, Breadth-First Search, Binary Tree
* Link: https://leetcode.com/problems/same-tree
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q == null){
            return p == null && q == null;
        }
        
        if(p.val != q.val){
            return false;
        }
        boolean left = isSameTree(q.left, p.left);
        boolean right = isSameTree(q.right, p.right);
        
        return left && right;
    }
}