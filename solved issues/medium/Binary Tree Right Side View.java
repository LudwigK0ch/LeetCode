/**
* Problem: 199. Binary Tree Right Side View
* Difficulty: Medium
* Categories: Tree, Depth-First Search, Breadth-First Search, Binary Tree
* Link: https://leetcode.com/problems/binary-tree-right-side-view
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rsw = new ArrayList<>();
        if(root == null) return rsw;
        Deque<TreeNode> dq = new LinkedList<>();
        dq.add(root);
        
        while(!dq.isEmpty()){
            int size = dq.size();
            for(int i = 0; i < size; i++){
                TreeNode node = dq.poll();
                if(i == size - 1) rsw.add(node.val);
                if(node.left != null) dq.add(node.left);
                if(node.right != null) dq.add(node.right);
            }
        }
        
        return rsw;
    }
}