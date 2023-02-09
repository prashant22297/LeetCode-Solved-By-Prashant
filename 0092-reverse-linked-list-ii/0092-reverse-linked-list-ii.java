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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right) return head;
        ListNode cur=head,prev=null;
        int l = left;
        while(l-->1){
            ListNode next = cur.next;
            prev=cur;
            cur=next;
        }
        // head.next = null;
        int i=right-left+1;
        ListNode last=prev;
        ListNode neww =cur;
        while(i>0 && cur!=null){
            // System.out.println(cur.val);
            ListNode next = cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
            i--;
        }
        if(last!=null){
            last.next=prev;
        }
        else {
            head=prev;
        }
        neww.next=cur;
        return head;
    }
}