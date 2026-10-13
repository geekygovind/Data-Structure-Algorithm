
/* Structure of linked list Node
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/
class Solution {
    public Node removeDuplicates(Node head) {
        // code here
        HashSet<Integer> ans = new HashSet<>();
        Node temp = head;
        Node prev = null;
        
        if(head == null) return null;
        
        while(temp != null){
            if(!ans.contains(temp.data)){
                ans.add(temp.data);
                prev = temp;
            }
            else{
                prev.next = temp.next;
            }
            temp = temp.next;
        }
        return head;
    }
}
