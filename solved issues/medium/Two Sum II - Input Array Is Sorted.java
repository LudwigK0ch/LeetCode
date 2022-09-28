/**
* Problem: 167. Two Sum II - Input Array Is Sorted
* Difficulty: Medium
* Categories: Array, Two Pointers, Binary Search
* Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted
*/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        
        while(numbers[start] + numbers[end] != target){
            if(numbers[start] + numbers[end] < target){
                start++;
                continue;
            }
            
            if(numbers[start] + numbers[end] > target){
                end--;
                continue;
            }
        }
        
        return new int[] {start + 1, end + 1};
    }
}