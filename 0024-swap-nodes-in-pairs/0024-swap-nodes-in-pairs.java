
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode curr=head;
        ListNode prev =null;
        while(curr != null){
            if(curr.next !=null){
                ListNode remainingList=curr.next.next;
                curr.next.next=null;
                ListNode next=curr.next;
                curr.next=null;
                next.next=curr;
                curr.next=remainingList;
                if(prev==null){
                    head=next;
                }
                else{
                 prev.next=next;
                }
                prev=curr;
                curr=remainingList;
            }else{
                curr=curr.next;
            }
        }
        return head;
    }
}