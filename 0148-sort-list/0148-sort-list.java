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
    public ListNode mid(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode mid=slow.next;
        slow.next=null;
        return mid;
    }
    public ListNode merge(ListNode node1,ListNode node2){

        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        while(node1!=null && node2!=null)
        {
            if(node1.val<node2.val)
            {
                temp.next=node1;
                node1=node1.next;
            }
            else
            {
                temp.next=node2;
                node2=node2.next;
            }
            temp=temp.next;
        }
        temp.next= (node1!=null) ? node1: node2;
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode mid=mid(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);
        return merge(left,right);

    }
}