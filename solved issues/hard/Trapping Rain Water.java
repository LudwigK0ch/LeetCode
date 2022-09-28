/**
* Problem: 42. Trapping Rain Water
* Difficulty: Hard
* Categories: Array, Two Pointers, Dynamic Programming, Stack, Monotonic Stack
* Link: https://leetcode.com/problems/trapping-rain-water
*/

class Solution {
    public int trap(int[] height) {
        int result = 0;
        int[] maxL = new int[height.length];
        int[] maxR = new int[height.length];
        
        int currentMax = 0;
        for(int i = 0; i < height.length; i++){
            maxL[i] = Math.max(height[i], currentMax);
            currentMax = maxL[i];
        }
        
        currentMax = 0;
        for(int i = height.length - 1; i >= 0; i--){
            maxR[i] = Math.max(height[i], currentMax);
            currentMax = maxR[i];
            
        }
        
        for(int i = 0; i < height.length; i++){
             result += Math.min(maxL[i], maxR[i]) - height[i];
        }
        
        
        return result;
    }
}