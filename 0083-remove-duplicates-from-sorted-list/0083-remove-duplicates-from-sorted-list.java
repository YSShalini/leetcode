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
    public ListNode deleteDuplicates(ListNode head) {
         if(head==null){return null;}
         ListNode temp2=head,temp1=temp2.next;
         while(temp2!=null&&temp1!=null){
            if(temp2.val==temp1.val){
                temp2.next=temp1.next;
                temp1=temp2.next;
            }
            else{
                temp2=temp1;
                temp1=temp1.next;
            }
         }
         return head;
    }
}