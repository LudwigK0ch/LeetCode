/**
* Problem: 102. Binary Tree Level Order Traversal
* Difficulty: Medium
* Categories: Tree, Breadth-First Search, Binary Tree
* Link: https://leetcode.com/problems/binary-tree-level-order-traversal
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode> dq = new LinkedList<>();
        dq.addLast(root);
        while(!dq.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int size = dq.size();
            for(int i = 0; i < size; i++){
                TreeNode node = dq.pollFirst();
                if(node != null){
                    level.add(node.val);
                    dq.addLast(node.left);
                    dq.addLast(node.right);
                }
            }
            if(!level.isEmpty()){
                result.add(level);
            }
        }
        
        return result;
    }
}