/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    Map<Node,Node> mp = new HashMap<>();
    public Node copyRandomList(Node head) {
//         if(head == null) return null;
//         if(mp.containsKey(head)) return mp.get(head);
//         Node temp = new Node(head.val);
//         mp.put(head,temp);
        
//         temp.next = copyRandomList(head.next);
//         temp.random = copyRandomList(head.random);
//         return temp;
        
        if(head == null) return null;
        
        Node curr = head;
        Node newCurr = null;
        Node newHead = null;
        while(curr!=null){
            Node temp = new Node(curr.val);
            mp.put(curr,temp);
            if(newHead==null) {
                newHead = temp;
                newCurr = temp;
            }
            else{
                newCurr.next = temp;
                newCurr=newCurr.next; ;
            }
            curr=curr.next;
        }
        curr = head;
        newCurr = newHead;
        while(curr!=null){
            newCurr.random = mp.get(curr.random);
            curr=curr.next;
            newCurr=newCurr.next;
        }
        return newHead;
    }
}