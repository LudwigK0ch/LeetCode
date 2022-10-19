/**
* Problem: 39. Combination Sum
* Difficulty: Medium
* Categories: Array, Backtracking
* Link: https://leetcode.com/problems/combination-sum
*/

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        
        backtrack(0, candidates, target, result, subset);
        
        return result;
    }
    
    private void backtrack(int i, int[] candidates, int target, List<List<Integer>> result, List<Integer> subset){
        if(i >= candidates.length){
            return;
        }
        
        int sum = sumList(subset);
        if(sum > target){
            return;
        }
        
        if(sum == target){
            result.add(new ArrayList<>(subset));
            return;
        }
        
        subset.add(candidates[i]);
        backtrack(i, candidates, target, result, subset);
        
        subset.remove(subset.size() - 1);
        backtrack(i + 1, candidates, target, result, subset);
    }
    
    private int sumList(List<Integer> subset){
        int res = 0;
        for(int i : subset){
            res += i;
        }
        
        return res;
    }
}