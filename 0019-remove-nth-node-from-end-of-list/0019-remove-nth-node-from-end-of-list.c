/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    struct ListNode *temp1=head,*temp2=head,*len=head;
    int j=0;
    while(len!=NULL){
        j++;
        len=len->next;
    }
    if(j==1){
        head=head->next;
    }
    else{
        while(j!=n){
             temp2=temp1;
        temp1=temp1->next;
         j--;
           }
        if(temp1!=temp2){
        temp2->next=temp1->next;}
        else{
            head=head->next;
        }
        
    }
    return head;
}