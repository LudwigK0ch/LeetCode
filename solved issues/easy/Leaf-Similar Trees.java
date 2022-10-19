/**
* Problem: 872. Leaf-Similar Trees
* Difficulty: Easy
* Categories: Tree, Depth-First Search, Binary Tree
* Link: https://leetcode.com/problems/leaf-similar-trees
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return traverse(root1).equals(traverse(root2));
    }
    
    private String traverse(TreeNode node){
        if(node == null){
            return "";
        }
        
        if(node.left == null && node.right == null){
            return node.val + ",";
        }
        
        return traverse(node.left) + traverse(node.right);
    }
}