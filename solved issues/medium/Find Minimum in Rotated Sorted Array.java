/**
* Problem: 153. Find Minimum in Rotated Sorted Array
* Difficulty: Medium
* Categories: Array, Binary Search
* Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array
*/

class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int min = nums[0];
        while(left <= right){
            int mid = (left + right) / 2;
            min = Math.min(min, nums[mid]);
            if(nums[left] <= nums[mid]){
                if(nums[left] <= nums[right]){
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if(nums[mid] >= nums[right]){
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        
        return min;
    }
}