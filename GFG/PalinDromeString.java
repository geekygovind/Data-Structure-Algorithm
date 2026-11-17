/* Node Structure
class Node {
    String data;
    Node next;
    Node(String x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public boolean compute(Node root) {
        // code here
        Node temp = root;
        
        StringBuilder sb = new StringBuilder();
        
        while(temp != null){
            sb.append(temp.data);
            
            temp = temp.next;
        }
        String str = sb.toString();
        String rev = sb.reverse().toString();
        
        return str.equals(rev);
    }
}
