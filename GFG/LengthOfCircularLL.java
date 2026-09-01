/* Linked List Node Structure
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    public static int getLength(Node head) {
        // code here
        Node val = head;
        int c = 1;
        while (val.next != head){
            c++;
            val = val.next;
        }
        return c;
    }
}
