/**
* Problem: 1486. XOR Operation in an Array
* Difficulty: Easy
* Categories: Math, Bit Manipulation
* Link: https://leetcode.com/problems/xor-operation-in-an-array
*/

class Solution {
    public int xorOperation(int n, int start) {
        int previous = 0;
        for(int i = 0; i < n; i++){
            int num = start + 2 *i;
            previous = previous ^ num;
        }
        
        return previous;
    }
}