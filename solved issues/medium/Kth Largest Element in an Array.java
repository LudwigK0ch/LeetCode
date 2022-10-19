/**
* Problem: 215. Kth Largest Element in an Array
* Difficulty: Medium
* Categories: Array, Divide and Conquer, Sorting, Heap (Priority Queue), Quickselect
* Link: https://leetcode.com/problems/kth-largest-element-in-an-array
*/

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int target = nums.length - k;
        return quickSelect(nums, target, 0, nums.length - 1);
    }
    
    private int quickSelect(int[] nums, int target, int l, int r){
        int pivot = r;
        int pointer = l;
        
        for(int i = l; i < r; i++){
            if(nums[i] <= nums[pivot]){
                int temp = nums[pointer];
                nums[pointer] = nums[i];
                nums[i] = temp;
                pointer++;
            }
        }
        int temp = nums[pointer];
        nums[pointer] = nums[pivot];
        nums[pivot] = temp;
        
        if(pointer > target){
            return quickSelect(nums, target, l, pointer - 1);
        } else if(pointer < target){
            return quickSelect(nums, target, pointer + 1, r);
        } else {
            return nums[pointer];
        }
    }
}