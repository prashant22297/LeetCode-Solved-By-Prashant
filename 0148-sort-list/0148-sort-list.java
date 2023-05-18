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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next==null) return head;
        ListNode slow = head, fast=head, prev=null;
        
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
            
        }
        prev.next=null;
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        
        return merge(l1,l2);
        
    }
    
    ListNode merge(ListNode l1, ListNode l2){
        ListNode temp = new ListNode();
        ListNode t = temp;
        while(l1!=null && l2!=null){
            if(l1.val <=l2.val){
                temp.next=l1;
                l1=l1.next;
                temp=temp.next;
            }
            else{
                temp.next=l2;
                l2=l2.next;
                temp=temp.next;
            }
        }
        if(l1!=null){
            temp.next=l1;
            l1=l1.next;
        }
        if(l2!=null){
            temp.next=l2;
            l2=l2.next;
        }
        return t.next;
    }
}