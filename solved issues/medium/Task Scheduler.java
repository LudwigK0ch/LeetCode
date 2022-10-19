/**
* Problem: 621. Task Scheduler
* Difficulty: Medium
* Categories: Array, Hash Table, Greedy, Sorting, Heap (Priority Queue), Counting
* Link: https://leetcode.com/problems/task-scheduler
*/

class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        Deque<Pair<Integer, Integer>> dq = new LinkedList<>();
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(char c : tasks){
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        
        for(int v : hm.values()){
            pq.offer(v);
        }
        
        int time = 0;
        
        while(!pq.isEmpty() || !dq.isEmpty()){
            time++;
            if(!pq.isEmpty()){
                int count = pq.poll() - 1;
                if(count > 0){
                    dq.addLast(new Pair(count, time + n));
                }
            }
            
            if(!dq.isEmpty() && dq.peekFirst().getValue() == time){
                pq.offer(dq.pollFirst().getKey());
            }
        }
        
        return time;
    }
}