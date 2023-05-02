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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = new ListNode();
        ListNode curr = head;
        int count =0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        curr=head;
        if(count==1) return head=null;
        count=count-n;
        if(count==0) return head.next;
        // System.out.println(count);
        while(curr!=null && count-->0){
            prev=curr;
            curr=curr.next;
        }
        if(curr.next==null){
            prev.next=null;
        }
        else prev.next=curr.next;
        System.out.println(prev.val+" "+curr.val);
        return head;
    }
}