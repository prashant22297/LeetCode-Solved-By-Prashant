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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans= new ListNode[k];
        int count = 0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int each=count/k;
        int extra= count%k;
        int index = 0;
        temp = head;
        
        while(temp!=null && index<k){
            ans[index++]=temp;
            int diff = extra>0?1:0;
            ListNode prev=null;
            for(int i=0;i<each+diff;i++){
                prev = temp;
                temp=temp.next;
            }
            prev.next=null;
            extra--;            
        }
        return ans;
    }
}