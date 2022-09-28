/**
* Problem: 143. Reorder List
* Difficulty: Medium
* Categories: Linked List, Two Pointers, Stack, Recursion
* Link: https://leetcode.com/problems/reorder-list
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
    public void reorderList(ListNode head) {
        //Find second half
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        //Reverse second half
        ListNode previous = null;
        ListNode current = slow.next;
        slow.next = null;
        while(current != null){
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        
        //Merge lists
        ListNode list1 = head;
        ListNode list2 = previous;
        while(list2 != null){
            ListNode l1Next = list1.next;
            ListNode l2Next = list2.next;
            list1.next = list2;
            list2.next = l1Next;
            list1 = l1Next;
            list2 = l2Next;
        }
    }
}