/**
* Problem: 49. Group Anagrams
* Difficulty: Medium
* Categories: Array, Hash Table, String, Sorting
* Link: https://leetcode.com/problems/group-anagrams
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {    
        HashMap<String, List<String>> hm = new HashMap<String, List<String>>();
        for(int i = 0; i < strs.length; i++){
            char charArray[] = strs[i].toCharArray();
            Arrays.sort(charArray);
            String sorted = String.valueOf(charArray);
            hm.putIfAbsent(sorted, new ArrayList<>());
            hm.get(sorted).add(strs[i]);
        }
        
        return new ArrayList<>(hm.values());
    }
}