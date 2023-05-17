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
    public int pairSum(ListNode head) {
        int sum=0;
        ListNode slow = head, fast = head,prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        // System.out.println(slow.val);
        prev=null;
        while(slow!=null){
            ListNode next = slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }
        // List
        while(prev!=null){
            sum=Math.max(sum,head.val+prev.val);
            head=head.next;
            prev=prev.next;
        }
        return sum;
    }
}