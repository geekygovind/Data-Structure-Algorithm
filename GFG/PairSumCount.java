/*Structure of a link list node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }

    https://www.geeksforgeeks.org/problems/count-pairs-whose-sum-is-equal-to-x/1
    
}*/

class Solution {
    public int countPairs(Node head1, Node head2, int x) {
        // code here
        int c = 0;
        HashSet<Integer> ans = new HashSet<>();
        while(head1 != null){
            ans.add(head1.data);
            head1 = head1.next;
        }
        while(head2 != null){
            if(ans.contains(x-head2.data)) c++;
            
            head2 = head2.next;
        }
        return c;
    }
}
