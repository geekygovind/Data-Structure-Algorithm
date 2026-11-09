/* Structure for link list Node
class Node {
  public:
    int data;
    public Node next;
    public Node(int val) {
        data = val;
        next = null;
    }
}; */

class Solution {
    public int sumofNodes(Node head, int n) {
        // code here
        Node slow = head;
        Node fast = head;
        
        for(int i = 0; i < n; i++) fast = fast.next;
        
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        int sum = 0;
        while(slow != null){
            sum += slow.data;
            slow = slow.next;
        }
        
        return sum;
    }
};
