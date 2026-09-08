/* Definition of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}*/

class Solution {
    public Node sortedInsert(Node head, int key) {
        // code here
        Node curr = head;
        Node newN = new Node(key);
        if(head == null || key < head.data){
            newN.next = head;
            return newN;
        }
        
        while(curr.next != null && curr.next.data < key) curr = curr.next;
        
        newN.next = curr.next;
        curr.next = newN;
        
        return head;
    }
}
