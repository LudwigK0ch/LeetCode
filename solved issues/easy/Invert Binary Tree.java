/**
* Problem: 226. Invert Binary Tree
* Difficulty: Easy
* Categories: Tree, Depth-First Search, Breadth-First Search, Binary Tree
* Link: https://leetcode.com/problems/invert-binary-tree
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
    public TreeNode invertTree(TreeNode root) {
        if(root != null){
            TreeNode left = root.left;
            TreeNode right = root.right;
            root.left = right;
            root.right = left;
            invertTree(root.left);
            invertTree(root.right);
        }
        
        return root;
    }
}