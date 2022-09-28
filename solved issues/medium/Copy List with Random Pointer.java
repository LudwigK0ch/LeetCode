/**
* Problem: 138. Copy List with Random Pointer
* Difficulty: Medium
* Categories: Hash Table, Linked List
* Link: https://leetcode.com/problems/copy-list-with-random-pointer
*/

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> nodes = new HashMap<>();
        Node node = head;
        while(node != null){
            nodes.put(node, new Node(node.val));
            node = node.next;
        }
        
        node = head;
        while(node != null){
            nodes.get(node).next = nodes.get(node.next);
            nodes.get(node).random = nodes.get(node.random);
            node = node.next;
        }
        
        return nodes.get(head);
    }
}