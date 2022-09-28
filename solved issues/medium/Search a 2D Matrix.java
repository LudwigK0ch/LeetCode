/**
* Problem: 74. Search a 2D Matrix
* Difficulty: Medium
* Categories: Array, Binary Search, Matrix
* Link: https://leetcode.com/problems/search-a-2d-matrix
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;
        
        while(i < matrix.length && j >= 0){
            if(matrix[i][j] == target){
                return true;
            }
            if(target < matrix[i][j]){
                j--;
            }
            else{
                i++;
            }
        }
        
        return false;
    }
}