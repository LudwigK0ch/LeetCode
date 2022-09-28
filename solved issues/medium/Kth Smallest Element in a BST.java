/**
* Problem: 230. Kth Smallest Element in a BST
* Difficulty: Medium
* Categories: Tree, Depth-First Search, Binary Search Tree, Binary Tree
* Link: https://leetcode.com/problems/kth-smallest-element-in-a-bst
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
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack = new LinkedList<>();
        while(true){
            while(root != null){
                stack.addFirst(root);
                root = root.left;
            }
            root = stack.pollFirst();
            if(--k == 0){
                return root.val;
            }
            
            root = root.right;
        }
        
    }
}