/**
* Problem: 441. Arranging Coins
* Difficulty: Easy
* Categories: Math, Binary Search
* Link: https://leetcode.com/problems/arranging-coins
*/

class Solution {
    public int arrangeCoins(int n) {
        int res = 0;
        while(n >= res + 1){
            res++;
            n -= res;
        }
        
        return res;
    }
}