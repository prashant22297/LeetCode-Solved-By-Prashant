/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // Method 1: Brute Force
        // HashSet<ListNode> hash = new HashSet<>();
        // ListNode temp=head;
        // if(temp==null || temp.next==null) return null;
        // while(temp.next!=null && !hash.contains(temp)){
        //     hash.add(temp);
        //     temp=temp.next;
        // }
        // if(temp==null || temp.next==null) return null;
        // else return temp;
        
        // Method 2:
        if(head==null || head.next==null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                ListNode start=head;
                while(start!=fast){
                    start=start.next;
                    fast=fast.next;
                }
                if(start==fast) return start;
            }
        }
        return null;
    }
}