/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/


class Solution {
    public int getNode(Node head, int k) {
        Node temp = head;
        if (k <= 0) return -1;

        while (temp != null && k > 1){
            temp = temp.next;
            k--;
        }
        if (temp == null){
            return -1;
        }
        return temp.data;
    }
}
