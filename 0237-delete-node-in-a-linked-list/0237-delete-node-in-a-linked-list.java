/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        int prev = node.val;
        int nxt = node.next.val;
        node.val=nxt;
        node.next=node.next.next;
    }
}