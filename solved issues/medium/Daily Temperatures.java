/**
* Problem: 739. Daily Temperatures
* Difficulty: Medium
* Categories: Array, Stack, Monotonic Stack
* Link: https://leetcode.com/problems/daily-temperatures
*/

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> dq = new LinkedList<>();
        int[] res = new int[temperatures.length];
        
        for(int i = 0; i < temperatures.length; i++){
            while(!dq.isEmpty() && temperatures[dq.peek()] < temperatures[i]){
                int index = dq.pop();
                res[index] = i - index;
            }
            
            dq.push(i);
        }
        
        return res;
    }
}