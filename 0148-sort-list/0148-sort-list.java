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
    public ListNode sortList(ListNode head) {
        PriorityQueue<Integer>queue=new PriorityQueue<>();
        ListNode dummy=new ListNode(0);
        ListNode temp=head,curr=dummy;
        while(temp!=null){
            queue.add(temp.val);
            temp=temp.next;
        }
        while(!queue.isEmpty()){
            dummy.next=new ListNode(queue.poll());
            dummy=dummy.next;
        }
        return curr.next;
    }
}