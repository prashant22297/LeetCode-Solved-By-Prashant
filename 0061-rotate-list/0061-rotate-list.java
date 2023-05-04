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
    public ListNode rotateRight(ListNode head, int k) {
        int count = 0;
        ListNode temp= head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        // System.out.println(count+" "+k%count);
        if(count==0) return null;
        if(count==1) return head;
        if(k==0 || k%count==0) return head;
        int K = count-(k%count);
        temp=head;
        // System.out.println(count+" "+K);
        while(K-->1){
            temp=temp.next;
        }
        ListNode t1 = temp.next;
        temp.next=null;
        temp=t1;
        while(temp!=null && temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        // System.out.println(t1.val);
        return t1;
    }
}