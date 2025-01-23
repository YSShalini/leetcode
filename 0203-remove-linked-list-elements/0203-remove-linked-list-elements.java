
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null&&head.val==val){head=head.next;}
           if(head==null){return null;}
     
        ListNode temp2=head,temp1=temp2.next;
        while(temp1!=null){
            if(temp1.val==val){
                temp2.next=temp1.next;
                temp1=temp2.next;
            }
            else{temp2=temp1;
            temp1=temp1.next;
            }
            
        }
        return head;
    }
}