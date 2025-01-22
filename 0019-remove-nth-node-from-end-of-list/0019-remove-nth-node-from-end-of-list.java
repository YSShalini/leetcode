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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head,temp1=head;
        int l=0,i=0;
        while(temp!=null){l++;
        temp=temp.next;}
        int d=l-n;
        if(d==0){return head.next;}
        for(i=0;i<d-1;i++){
            temp1=temp1.next;
        }
        temp1.next=temp1.next.next;
        return head;
    }

}