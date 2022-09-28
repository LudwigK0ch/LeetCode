/**
* Problem: 853. Car Fleet
* Difficulty: Medium
* Categories: Array, Stack, Sorting, Monotonic Stack
* Link: https://leetcode.com/problems/car-fleet
*/

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] cars = new int[position.length][2];
        
        for(int i = 0; i < position.length; i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        
        Arrays.sort(cars, (a, b) -> b[0] - a[0]);
        
        Deque<Double> time2Finish = new LinkedList<>();
        
        for(int i = 0; i < cars.length; i++){
            double ttF = (double)(target - cars[i][0]) / cars[i][1];
            if(time2Finish.isEmpty() || time2Finish.peek() < ttF){
                 time2Finish.push(ttF);
            }
        }
        
        return time2Finish.size();
    }
}