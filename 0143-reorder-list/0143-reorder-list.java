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
    ListNode temp;
    boolean nulll=false;
    public void reorderList(ListNode head) {
        temp=head;
        solve(head);
//         ListNode p1=head;
//         ListNode p2=head;
//         while(p2.next!=null && p2.next.next!=null){
//             p1=p1.next;
//             p2=p2.next.next;
//         }
//         // System.out.println(p1.val);
//         ListNode current = p1.next, prev=null;
//         p1.next=null;
//         while(current!=null){
//             ListNode next = current.next;
//             current.next=prev;
//             prev=current;
//             current=next;
//         }
        
//         ListNode cur1 = head;
//         ListNode cur2 = prev;
//         while(cur1!=null && cur2!=null){
//             ListNode next1 = cur1.next;
//             ListNode next2 = cur2.next;
//             cur1.next=cur2;
//             cur2.next=next1;
//             cur1=next1;
//             cur2=next2;
        // }
    }
    public void solve(ListNode head){
        if(head==null) return;
        solve(head.next);
        
        if(nulll==false){
        ListNode next = temp.next;
        temp.next=head;
        head.next=next;
        temp=next;
        }
        
        if(temp!=null && temp.next==head){
            temp.next=null;
            nulll=true;
            return;
        }
        
    }
}