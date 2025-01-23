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
    public void reorderList(ListNode head) {
        ListNode fast=head,slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=slow,next=null,prev=null;
        while(temp!=null){
            next=temp.next;
             temp.next=prev;
             prev=temp;
             temp=next;
        }
        ListNode first=head,second=prev;
        while(second.next!=null){
            ListNode temp1=first.next;
            ListNode temp2=second.next;

            first.next=second;
            second.next=temp1;

            first=temp1;
            second=temp2;
        }
        
    }
}