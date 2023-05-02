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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr = head;
        ListNode prev = head;
        int total=0;
        while(curr.next!=null){
            total++;
            if(total<k) prev=prev.next;
            curr=curr.next;
        }
        int N=total-k;
        curr=head;
        while(curr.next!=null && N-->=0){
            curr=curr.next;
        }
        int temp= prev.val;
        prev.val=curr.val;
        curr.val=temp;
        // System.out.println(prev.val+" "+curr.val);
        return head;
    }
}