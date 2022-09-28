/**
* Problem: 20. Valid Parentheses
* Difficulty: Easy
* Categories: String, Stack
* Link: https://leetcode.com/problems/valid-parentheses
*/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        HashMap<Character, Character> hm  = new HashMap<>();
        hm.put(')', '(');
        hm.put(']', '[');
        hm.put('}', '{');
        
        for(int i = 0; i < s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                if(st.empty() || st.pop() != hm.get(s.charAt(i))){
                    return false;
                }
            } else {
                st.push(s.charAt(i));
            }
        }
        
        return st.empty();
    }
}