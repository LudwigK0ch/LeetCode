/**
* Problem: 1046. Last Stone Weight
* Difficulty: Easy
* Categories: Array, Heap (Priority Queue)
* Link: https://leetcode.com/problems/last-stone-weight
*/

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> Integer.compare(y, x));
        for(int s : stones) pq.offer(s);
        
        while(pq.size() > 1){
            int smash = pq.poll() - pq.poll();
            if(smash != 0) pq.offer(smash);
        }
        
        return pq.peek() == null ? 0 : pq.poll();
    }
}