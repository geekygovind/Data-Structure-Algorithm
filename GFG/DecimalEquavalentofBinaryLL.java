/* LinkedList Node structure
class Node {
    int data;   // data is either 0 or 1
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
};
*/
class Solution {
    public long decimalValue(Node head) {
        long ans = 0;
        long md = 1000000007;
        Node temp = head;
        
        while(temp != null){
            int k = temp.data;
            
            ans = (ans*2+k) % md;
            
            temp = temp.next;
        }
        return ans;
    }
};
