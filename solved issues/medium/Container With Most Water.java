/**
* Problem: 11. Container With Most Water
* Difficulty: Medium
* Categories: Array, Two Pointers, Greedy
* Link: https://leetcode.com/problems/container-with-most-water
*/

class Solution {
    public int maxArea(int[] height) {
        int current = 0;
        int max = current;
        int l = 0;
        int r = height.length - 1;
        
        while(l < r){
            current = (r - l) * Math.min(height[l], height[r]);
            max = Math.max(current, max);
            if(height[l] < height[r]){
                l++;
            } else {
                r--;
            }
        }
        
        return max;
    }
}