/* structure of list node:

class Node
{
    int data;
    Node next;
    Node(int val)
    {
        data=val;
        next=null;
    }
}

*/

class Solution {
    public Node findIntersection(Node head1, Node head2) {
        // code here
        HashSet<Integer> st = new HashSet<>();
        Node newn = new Node(0);
        
        Node temp = newn;
        
        while(head2 != null){
            st.add(head2.data);
            head2 = head2.next;
        }
        
        while(head1 != null){
            if(st.contains(head1.data)){
                Node t = new Node(head1.data);
                newn.next = t;
                newn = newn.next;
            }
            head1 = head1.next;
        }
        return temp.next;
    }
}
