/* Structure of linked list Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
};*/
class Solution {
    public Node pairwiseSwap(Node head) {
        // code here
        Node temp = head;
        while(temp != null && temp.next != null){
            int curr = temp.data;
            temp.data  = temp.next.data;
            temp.next.data = curr;
            
            temp = temp.next.next;
        }
        return head;
    }
}
