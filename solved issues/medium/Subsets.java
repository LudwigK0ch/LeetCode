/**
* Problem: 78. Subsets
* Difficulty: Medium
* Categories: Array, Backtracking, Bit Manipulation
* Link: https://leetcode.com/problems/subsets
*/

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        
        dfs(0, nums, res, subset);
        return res;
        
    }
    
    private void dfs(int i, int[] nums, List<List<Integer>> res, List<Integer> subset){
        if(i >= nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }
        
        subset.add(nums[i]);
        dfs(i + 1, nums, res, subset);
        
        subset.remove(subset.size() - 1);
        dfs(i + 1, nums, res, subset);
    }
}