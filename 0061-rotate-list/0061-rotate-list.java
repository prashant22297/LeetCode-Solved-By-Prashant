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
        ListNode temp = head;
        int len=1;
        if(head==null || head.next==null || k==0) return head;
        while(temp.next!=null){
            len++;
            temp=temp.next;
        }
        temp.next=head;
        // len++;
        // temp = head;
        int K= len-(k%len);
        while((K)-->0){
            temp=temp.next;
        }
        // ListNode ans = head;
        head=temp.next;
        temp.next=null;
        System.out.println(len);
        return head;
    }
}