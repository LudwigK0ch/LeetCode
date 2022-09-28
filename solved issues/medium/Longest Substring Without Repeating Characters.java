/**
* Problem: 3. Longest Substring Without Repeating Characters
* Difficulty: Medium
* Categories: Hash Table, String, Sliding Window
* Link: https://leetcode.com/problems/longest-substring-without-repeating-characters
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1) return s.length();
        
        int l = 0;
        int maxLength = 0;
        
        HashSet<Character> hs = new HashSet<>();
        for(int r = 0; r < s.length(); r++){
            while(hs.contains(s.charAt(r))){
                hs.remove(s.charAt(l));
                l++;
            }
            hs.add(s.charAt(r));
            maxLength = Math.max(maxLength, r - l + 1);
        }
        return maxLength;
    }
}