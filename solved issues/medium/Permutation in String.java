/**
* Problem: 567. Permutation in String
* Difficulty: Medium
* Categories: Hash Table, Two Pointers, String, Sliding Window
* Link: https://leetcode.com/problems/permutation-in-string
*/

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        
        int[] a1 = new int[26];
        int[] a2 = new int[26];
        
        for(int i = 0; i < s1.length(); i++){
            a1[s1.charAt(i) - 'a']++;
            a2[s2.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < s2.length() - s1.length(); i++){
            if(matches(a1, a2)){
                return true;
            }
            a2[s2.charAt(i) - 'a']--;
            a2[s2.charAt(i + s1.length()) - 'a']++;
        }
        
        return matches(a1, a2);
    }
    
    private boolean matches(int[] a1, int[] a2){
        for(int i = 0; i < a1.length; i++){
            if(a1[i] != a2[i]){
                return false;
            }
        }
        
        return true;
    }
}