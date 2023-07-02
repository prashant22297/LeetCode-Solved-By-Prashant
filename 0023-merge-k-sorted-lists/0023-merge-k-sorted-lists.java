/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // if(lists.length ==0) return new ListNode();
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(ListNode node : lists){
            while(node!=null){
                pq.offer(node.val);
                node=node.next;
            }
        }
        ListNode ans = new ListNode(-1);
        ListNode head = ans;
        while(!pq.isEmpty()){
            head.next = new ListNode(pq.poll());
            head=head.next;
        }
        return ans.next;
    }
}