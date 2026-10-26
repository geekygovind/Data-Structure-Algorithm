/* structure for link list node
class Node {
    Node next;
    int data;

    Node(int d) {
        data = d;
        next = null;
        
    }
}

LINK -- https://www.geeksforgeeks.org/problems/remove-every-kth-node/1
*/
class Solution {
    Node deleteK(Node head, int k) {
        // Your code here
        if(k == 1) return null;
        Node temp = head;
        Node prev = null;
        int m = 1;
        while(temp != null){
            
            if(m%k==0){
                prev.next = temp.next;
            }
            else prev = temp;
            
            temp = temp.next;
            m++;
        }
        return head;
    }
}
