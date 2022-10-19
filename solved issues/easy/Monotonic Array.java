/**
* Problem: 896. Monotonic Array
* Difficulty: Easy
* Categories: Array
* Link: https://leetcode.com/problems/monotonic-array
*/

class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = nums[0] <= nums[nums.length - 1];
        int previous = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(increasing && previous > nums[i] ||
              !increasing && previous < nums[i]){
                return false;
            }
            previous = nums[i];
        }
        
        return true;
    }
}