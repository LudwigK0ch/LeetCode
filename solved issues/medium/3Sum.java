/**
* Problem: 15. 3Sum
* Difficulty: Medium
* Categories: Array, Two Pointers, Sorting
* Link: https://leetcode.com/problems/3sum
*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i++){
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int j = i + 1;
                int k = nums.length - 1;

                while(j < k){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum == 0){
                        ArrayList<Integer> l = new ArrayList<Integer>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[k]);

                        res.add(l);

                        while(j < k && nums[j] == nums[j + 1]){
                            j++;
                        }

                        while(j < k && nums[k] == nums[k - 1]){
                            k--;
                        }
                        j++;
                        k--;
                    } else if(sum > 0){
                        k--;
                    }
                    else {
                        j++;
                    }
                }
            }
        }
        
        return res;
    }
}