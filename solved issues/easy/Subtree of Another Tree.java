/**
* Problem: 572. Subtree of Another Tree
* Difficulty: Easy
* Categories: Tree, Depth-First Search, String Matching, Binary Tree, Hash Function
* Link: https://leetcode.com/problems/subtree-of-another-tree
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null){
            return false;
        }
        
        if(root.val == subRoot.val && isSameTree(root, subRoot)){
            return true;
        }
        
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    
    private boolean isSameTree(TreeNode n1, TreeNode n2){
        if(n1 == null || n2 == null){
            return n1 == null && n2 == null;
        }
        
        if(n1.val != n2.val){
            return false;
        }
        
        return isSameTree(n1.left, n2.left) && isSameTree(n1.right, n2.right);
    }
}