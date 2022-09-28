/**
* Problem: 169. Majority Element
* Difficulty: Easy
* Categories: Array, Hash Table, Divide and Conquer, Sorting, Counting
* Link: https://leetcode.com/problems/majority-element
*/

class Solution {
    public int majorityElement(int[] nums) {
        //Base case for length == 1
        if(nums.length == 1) return nums[0];
        
        int counter = 1;
        int max = 1;
        int currentMax = nums[0];
        for(int i = 0; i < nums.length; i++){
            int current = nums[i];
            for(int j = i + 1; j < nums.length; j++){
                if(current == nums[j]){
                    counter++;
                }
            }
            System.out.println(counter);
            if(counter > max){
                max = counter;
                currentMax = current;
            }
            counter = 1;
        }
        
        return currentMax;
    }
}