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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next==null) return head;
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode temp =null;
        ListNode newHead = curr;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            if(temp==null || temp.next==null){
                prev.next=temp;
                curr=null;
            }
            else{
                curr=temp.next;
                prev.next=curr;
                prev=temp;
            }
        }
        return newHead;
    }
}