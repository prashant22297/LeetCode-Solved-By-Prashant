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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int x =l1!=null?l1.val:0;
            int y=l2!=null?l2.val:0;
            int z=x+y+carry;
            carry=z/10;
            temp.next = new ListNode(z%10);
            temp=temp.next;
            l1=l1!=null?l1.next:null;
            l2=l2!=null?l2.next:null;
        }
        return ans.next;
    }
}