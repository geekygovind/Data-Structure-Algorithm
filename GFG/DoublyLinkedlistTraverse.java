/* Structure of doubly linked list Node
class Node {
  public int data;
  public Node next;
  public Node prev;

  public Node(int x) {
      data = x;
      next = null;
      prev = null;
  }
};*/
class Solution {
    public List<List<Integer>> displayList(Node head) {
        List<Integer> forward = new ArrayList<>();
        List<Integer> backward = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        Node curr = head;
        Node tail = null;

        // Left to right
        while (curr != null){
            forward.add(curr.data);
            tail = curr;
            curr = curr.next;
        }
        curr = tail;
        while (curr != null){
            backward.add(curr.data);
            curr = curr.prev;
        }

        result.add(forward);
        result.add(backward);

        return result;
    }
}
