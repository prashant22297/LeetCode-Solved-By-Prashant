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
    int carry=0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // ListNode ans = new ListNode(0);
        // ListNode temp = ans;
        if(l1==null && l2==null && carry==0) return null;
        // while(l1!=null || l2!=null || carry!=0){
            int x =l1!=null?l1.val:0;
            int y=l2!=null?l2.val:0;
            int z=x+y+carry;
            carry=z/10;
        l1=l1!=null?l1.next:null;
        l2=l2!=null?l2.next:null;
        ListNode ans = new ListNode(z%10,addTwoNumbers(l1,l2));
        return ans;
    }
}