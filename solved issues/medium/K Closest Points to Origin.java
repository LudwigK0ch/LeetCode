/**
* Problem: 973. K Closest Points to Origin
* Difficulty: Medium
* Categories: Array, Math, Divide and Conquer, Geometry, Sorting, Heap (Priority Queue), Quickselect
* Link: https://leetcode.com/problems/k-closest-points-to-origin
*/

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> 
            Integer.compare(
                (b[0] * b[0] + b[1] * b[1]),
                (a[0] * a[0] + a[1] * a[1])
            ));
        
        for(int[] p : points){
            maxHeap.offer(p);
            if(maxHeap.size() > k){
                maxHeap.remove();
            }
        }
        
        int[][] res = new int[k][2];
        for(int i = 0; i < k; i++){
            int[] point = maxHeap.poll();
            res[i][0] = point[0];
            res[i][1] = point[1];
        }
        
        return res;
    }
}