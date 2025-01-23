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
    public boolean isPalindrome(ListNode head) {
       ListNode slow=head,fast=head;
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
       ListNode t1=head,t2=prev;

       while(t1!=null&&t2!=null){
         if(t1.val!=t2.val){
            return false;
         }else{
            t1=t1.next;
            t2=t2.next;
         }
       }
       return true;
    }
}