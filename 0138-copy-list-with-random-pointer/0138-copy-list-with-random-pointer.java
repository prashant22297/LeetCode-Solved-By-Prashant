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
    // Map<Node,Node> mp = new HashMap<>();
    public Node copyRandomList(Node head) {
//         if(head == null) return null;
//         if(mp.containsKey(head)) return mp.get(head);
//         Node temp = new Node(head.val);
//         mp.put(head,temp);
        
//         temp.next = copyRandomList(head.next);
//         temp.random = copyRandomList(head.random);
//         return temp;
        
        
        // Method 2 TC--O(N) SC--O(N) for map
//         if(head == null) return null;
        
//         Node curr = head;
//         Node newCurr = null;
//         Node newHead = null;
//         while(curr!=null){
//             Node temp = new Node(curr.val);
//             mp.put(curr,temp);
//             if(newHead==null) {
//                 newHead = temp;
//                 newCurr = temp;
//             }
//             else{
//                 newCurr.next = temp;
//                 newCurr=newCurr.next; ;
//             }
//             curr=curr.next;
//         }
//         curr = head;
//         newCurr = newHead;
//         while(curr!=null){
//             newCurr.random = mp.get(curr.random);
//             curr=curr.next;
//             newCurr=newCurr.next;
//         }
//         return newHead;
        
        // Method 3  TC-O(N),,, SC -- O(N) OR O(1) Topic for debate
        
        if(head == null) return null;
        Node curr = head;
        while(curr!=null){
            Node currNext = curr.next;
            Node newNode = new Node(curr.val);
            curr.next=newNode;
            newNode.next=currNext;
            curr=curr.next.next;
            
        }
        // curr = head;
        // while(curr!=null){
        //     System.out.print(curr.val+" ");
        //     curr=curr.next;
        // }
        
        
        curr=head;
        while(curr!=null && curr.next!=null){
            if(curr.random==null){
                curr.next.random = null;
            }
            else{
                curr.next.random = curr.random.next;
            }
            curr=curr.next.next;
        }
        
        curr = head;
        Node newHead = head.next;
        Node newCurr = newHead;
        
        while(curr!=null && newCurr!=null){
            curr.next=curr.next==null?null:curr.next.next;
            newCurr.next=newCurr.next==null?null:newCurr.next.next;
            curr=curr.next;
            newCurr = newCurr.next;
        }
        
        return newHead;
    }
}