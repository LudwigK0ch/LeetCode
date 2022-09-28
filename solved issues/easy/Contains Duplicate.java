/**
* Problem: 217. Contains Duplicate
* Difficulty: Easy
* Categories: Array, Hash Table, Sorting
* Link: https://leetcode.com/problems/contains-duplicate
*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(nums[i])){
                return true;
            }
            
            hm.put(nums[i], null);
        }
        
        return false;
    }
}