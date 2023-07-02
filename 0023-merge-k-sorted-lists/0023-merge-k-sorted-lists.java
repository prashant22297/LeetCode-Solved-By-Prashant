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
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // for(ListNode node : lists){
        //     while(node!=null){
        //         pq.offer(node.val);
        //         node=node.next;
        //     }
        // }
        // ListNode ans = new ListNode(-1);
        // ListNode head = ans;
        // while(!pq.isEmpty()){
        //     head.next = new ListNode(pq.poll());
        //     head=head.next;
        // }
        // return ans.next;
        
        ListNode ans = null;
        for(ListNode l : lists){
            ans = solve(ans, l);
        }
        return ans;
    }
    public ListNode solve(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val<l2.val){
            l1.next = solve(l1.next,l2);
            return l1;
        }
        else {
            l2.next = solve(l1,l2.next);
            return l2;
        }
    }
}