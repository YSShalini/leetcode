
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode dummy=new ListNode();
       ListNode res=dummy;
       int carry=0,tot=0;
       while(l1!=null||l2!=null||carry!=0){
           tot=carry;
           if(l1!=null){
            tot+=l1.val;
            l1=l1.next;
           }
           if(l2!=null){
            tot+=l2.val;
            l2=l2.next;
           }
           int n=tot%10;
           carry=tot/10;
           dummy.next=new ListNode(n);
           dummy=dummy.next;
           
       }
       return res.next;
    }
}