/* Structure of Linked List Node
class Node
{
  int data;
  Node next;
  Node(int data)
  {
      this.data = data;
      this.next = null;
  }
}*/

class Solution {
    static void linkDelete(Node head, int n, int m) {
        // code here
        Node temp = head;
        Node t = null;
        while(temp != null){
            for(int i = 1; i < m && temp != null; i++) temp = temp.next;
            
            if(temp == null) return;
            
            t = temp.next;
            
            for(int i = 1; i <= n && t != null; i++){
                Node tt = t;
                t= t.next;
            }
            
            temp.next = t;
            temp = t;
        }
    }
}
