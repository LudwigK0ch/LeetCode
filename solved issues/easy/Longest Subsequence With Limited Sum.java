/**
* Problem: 2389. Longest Subsequence With Limited Sum
* Difficulty: Easy
* Categories: Array, Binary Search, Greedy, Sorting, Prefix Sum
* Link: https://leetcode.com/problems/longest-subsequence-with-limited-sum
*/

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            nums[i ] += nums[i - 1];
        }
        
        int[] res = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            int j = Arrays.binarySearch(nums, queries[i]);
            res[i] = Math.abs(j + 1);
        }
        
        return res;
    }
}