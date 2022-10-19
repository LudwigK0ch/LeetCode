/**
* Problem: 2185. Counting Words With a Given Prefix
* Difficulty: Easy
* Categories: Array, String
* Link: https://leetcode.com/problems/counting-words-with-a-given-prefix
*/

class Solution {
    public int prefixCount(String[] words, String pref) {
        int res = 0;
        for(String word : words){
            if(word.indexOf(pref) == 0){
                res++;
            }
        }
        
        return res;
    }
}