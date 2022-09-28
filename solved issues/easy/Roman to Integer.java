/**
* Problem: 13. Roman to Integer
* Difficulty: Easy
* Categories: Hash Table, Math, String
* Link: https://leetcode.com/problems/roman-to-integer
*/

import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            int current = hm.get(s.charAt(i));
            if(i + 1 < s.length() && current < hm.get(s.charAt(i + 1))){
                res -= current;
            } else {
                res += current;
            }
        }
        
        return res;
    }
}