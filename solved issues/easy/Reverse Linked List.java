/**
* Problem: 206. Reverse Linked List
* Difficulty: Easy
* Categories: Linked List, Recursion
* Link: https://leetcode.com/problems/reverse-linked-list
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        boolean useRecursion = true;
        if(useRecursion){
            return reverseListRecurisve(head);
        }
        
        return reverseListIterative(head);
    }
    
    private ListNode reverseListRecurisve(ListNode node){
        if(node == null || node.next == null){
            return node;
        }
        
        ListNode last = reverseListRecurisve(node.next);
        node.next.next = node;
        node.next = null;
        return last;
    }
    
    private ListNode reverseListIterative(ListNode node){
        ListNode previous = null;
        ListNode current = node;
        
        while(current != null){
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        
        return previous;
    }
}