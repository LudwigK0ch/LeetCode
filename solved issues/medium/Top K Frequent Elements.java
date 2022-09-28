/**
* Problem: 347. Top K Frequent Elements
* Difficulty: Medium
* Categories: Array, Hash Table, Divide and Conquer, Sorting, Heap (Priority Queue), Bucket Sort, Counting, Quickselect
* Link: https://leetcode.com/problems/top-k-frequent-elements
*/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int num : nums){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        
        int[] result = new int[k];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->hm.get(b)-hm.get(a));
        pq.addAll(hm.keySet());
        
        int i = 0;
        while(i < k){
            result[i] = pq.remove();
            i++;
        }
        
        return result;
    }
}