/**
* Problem: 424. Longest Repeating Character Replacement
* Difficulty: Medium
* Categories: Hash Table, String, Sliding Window
* Link: https://leetcode.com/problems/longest-repeating-character-replacement
*/

class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int currentMax = 0;
        int result = 0;
        
        int l = 0;
        for(int r = 0; r < s.length(); r++){
            hm.put(s.charAt(r), hm.getOrDefault(s.charAt(r), 0) + 1);
            currentMax = Math.max(hm.get(s.charAt(r)), currentMax);
            
            while((r - l + 1) - currentMax > k){
                hm.put(s.charAt(l), hm.get(s.charAt(l)) - 1);
                l++;
            }
            
            result = Math.max(result, r - l + 1);
        }
        
        return result;
    }
}