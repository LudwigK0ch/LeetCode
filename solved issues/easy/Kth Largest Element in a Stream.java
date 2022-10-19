/**
* Problem: 703. Kth Largest Element in a Stream
* Difficulty: Easy
* Categories: Tree, Design, Binary Search Tree, Heap (Priority Queue), Binary Tree, Data Stream
* Link: https://leetcode.com/problems/kth-largest-element-in-a-stream
*/

class KthLargest {
    private int k;
    private PriorityQueue<Integer> minHeap;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();
        for(int n : nums){
            add(n);
        }
    }
    
    public int add(int val) {
        minHeap.offer(val);
        if(minHeap.size() > k){
            minHeap.poll();
        }
        
        return minHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */