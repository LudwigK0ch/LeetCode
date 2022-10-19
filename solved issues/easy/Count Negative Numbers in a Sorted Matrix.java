/**
* Problem: 1351. Count Negative Numbers in a Sorted Matrix
* Difficulty: Easy
* Categories: Array, Binary Search, Matrix
* Link: https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix
*/

class Solution {
    public int countNegatives(int[][] grid) {
        int res = 0;
        for(int[] i : grid){
            for(int j : i){
                if(j < 0) res++;
            }
        }
        
        return res;
    }
}