class Solution {
    public ArrayList<Node> splitList(Node head) {

        ArrayList<Node> ans = new ArrayList<>();
        if (head == null){
            ans.add(null);
            ans.add(null);
            return ans;
        }
        Node slow = head;
        Node fast = head;

        while (fast.next != head && fast.next.next != head){
            slow = slow.next;
            fast = fast.next;
            if(fast != head) fast = fast.next;
        }

        Node head1 = head;
        Node head2 = slow.next;
        
        slow.next = head1;
        Node temp = head2;

        while (temp.next != head) temp = temp.next;
        
        temp.next = head2;

        ans.add(head1);
        ans.add(head2);

        return ans;
    }
}
