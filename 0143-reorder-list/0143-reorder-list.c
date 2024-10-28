/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
void reorderList(struct ListNode* head) {
   struct ListNode *slow=head,*fast=head;
        while(fast!=NULL&&fast->next!=NULL){
            slow=slow->next;
            fast=fast->next->next;
        }
        struct ListNode *cur=slow->next,*prev=NULL;
        slow->next=NULL;
        while(cur){
            struct ListNode *next=cur->next;
            cur->next=prev;
            prev=cur;
            cur=next;

        }
        struct ListNode *head2=prev,*head1=head;
        while(head2){
           struct ListNode *temp1=head1->next;
           struct ListNode *temp2=head2->next;
           head1->next=head2;
           head2->next=temp1;
           head1=temp1;
           head2=temp2;
        }

        
}