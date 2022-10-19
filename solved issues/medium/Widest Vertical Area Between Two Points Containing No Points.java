/**
* Problem: 1637. Widest Vertical Area Between Two Points Containing No Points
* Difficulty: Medium
* Categories: Array, Sorting
* Link: https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points
*/

class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int max = 0;
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        
        int[] previous = points[0];
        for(int[] x : points){
            max = Math.max(max, x[0] - previous[0]);
            previous = x; 
        }
        
        return max;
    }
}