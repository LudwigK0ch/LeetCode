/**
* Problem: 875. Koko Eating Bananas
* Difficulty: Medium
* Categories: Array, Binary Search
* Link: https://leetcode.com/problems/koko-eating-bananas
*/

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 1;
        int[] speed = new int[piles.length];
        for(int pile : piles){
            right = Math.max(right, pile);
        }
        
        while(left < right){
            int mid = (left + right) / 2;
            int time = 0;
            for(int pile : piles){
                time += Math.ceil((double)pile / mid);
            }
            
            if(time > h){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return right;
    }
}