/**
* Problem: 1448. Count Good Nodes in Binary Tree
* Difficulty: Medium
* Categories: Tree, Depth-First Search, Breadth-First Search, Binary Tree
* Link: https://leetcode.com/problems/count-good-nodes-in-binary-tree
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
    int goodNodes = 0;
    public int goodNodes(TreeNode root) {
        maxDfs(root, Integer.MIN_VALUE);
        return goodNodes;
    }
    
    private void maxDfs(TreeNode node, int max){
        if(node == null){
            return;
        }
        
        //Check if node is good
        if(node.val >= max){
            goodNodes++;
            max = node.val;
        }
        
        maxDfs(node.left, max);
        maxDfs(node.right, max);
        
        return;
    }
}