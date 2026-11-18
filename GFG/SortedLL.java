/* Structure of linked list Node
class Node {
    public int data;
    public Node next;

    public Node(int x) {
        data = x;
        next = null;
    }
};*/

class Solution {
    public boolean isSorted(Node head) {
        // code here
        boolean asc = true;
        boolean dec = true;
        Node temp = head;
        
        while(temp != null && temp.next != null){
            if(temp.data > temp.next.data) asc = false;
            if(temp.data < temp.next.data) dec = false;
            
            temp = temp.next;
        }
        return asc || dec;
    }
}
