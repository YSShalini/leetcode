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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0){
            return head;
        }
        int c=1;
        ListNode temp=head,temp1=head,temp2;
        while(temp.next!=null){
            temp=temp.next;
             c++;
        }
        k=k%c;
        if (k == 0) {
            return head; // No rotation needed
        }
        int sub=c-k;
        for(int i=1;i<sub;i++){
          temp1=temp1.next;
        }
        
        temp2=temp1.next;
        temp1.next=null;
        temp.next=head;
       
    return temp2;
    }
    
}