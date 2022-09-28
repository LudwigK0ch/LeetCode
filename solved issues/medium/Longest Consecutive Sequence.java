/**
* Problem: 128. Longest Consecutive Sequence
* Difficulty: Medium
* Categories: Array, Hash Table, Union Find
* Link: https://leetcode.com/problems/longest-consecutive-sequence
*/

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        for(int i : nums){
            hm.put(i, i);
        }
        
        int lC = 1;
        int maxLc = lC;
        for(int n : nums){
            if(!hm.containsKey(n - 1)){
                //New sequence
                lC = 1;
                while(hm.containsKey(n + lC)){
                    lC++;
                }
                maxLc = Math.max(lC, maxLc);
            }
        }
        
        return maxLc;
    }
}