/**
* Problem: 14. Longest Common Prefix
* Difficulty: Easy
* Categories: String
* Link: https://leetcode.com/problems/longest-common-prefix
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        //Base case for strs 0
        if(strs == null || strs.length == 0){
            return "";
        }
        
        return longestCommonPrefix(strs, 0, strs.length - 1);
    }
    
    private String longestCommonPrefix(String[] strs, int l, int r){
        if(l == r){
            return strs[l];
        }
        
        int mid = (l + r)/2;
        String lcpL = longestCommonPrefix(strs, l, mid);
        String lcpR = longestCommonPrefix(strs, mid + 1, r);
        
        return commonPrefix(lcpL, lcpR);
    }
    
    private String commonPrefix(String l, String r){
        int min = Math.min(l.length(), r.length());
        for(int i = 0; i < min; i++){
            if(l.charAt(i) != r.charAt(i)){
                return l.substring(0, i);
            }
        }
        
        return l.substring(0, min);
    }
}