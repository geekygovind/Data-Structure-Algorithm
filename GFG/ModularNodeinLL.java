/*node class of the linked list is as:
class Node {
    int data;
     Node next;
     Node(int key)
     {
         data = key;
         next = null;
     }
}
*/

class Solution {
    public int modularNode(Node head, int k) {
        // code here
        if(head == null || k <= 0) return -1;
        
        Node temp = head;
        int gs = -1;
        int i = 1;
        while(temp != null){
            if(i % k == 0) gs = temp.data;
            temp = temp.next;
            i++;
        }
        return gs;
    }
}
