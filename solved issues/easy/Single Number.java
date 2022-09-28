/**
* Problem: 136. Single Number
* Difficulty: Easy
* Categories: Array, Bit Manipulation
* Link: https://leetcode.com/problems/single-number
*/

class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int n : nums){
            res = res ^ n;
        }
        
        return res;
    }
}