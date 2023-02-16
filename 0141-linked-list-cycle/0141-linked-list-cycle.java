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
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hash = new HashSet<>();
        ListNode temp=head;
        if(temp==null || temp.next==null) return false;
        while(temp.next!=null && !hash.contains(temp)){
            hash.add(temp);
            temp=temp.next;
        }
        if(temp==null || temp.next==null) return false;
        else return true;
    }
}