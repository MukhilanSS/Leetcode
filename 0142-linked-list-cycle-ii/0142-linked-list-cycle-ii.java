/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast)
                {
                    slow=slow.next;
                    fast=fast.next;
                }
                System.gc();
                return slow;
            }
        }
        System.gc();
        return null;
        // int length=0;
        // while(fast!=null && fast.next!=null){
        //     fast=fast.next.next;
        //     slow=slow.next;
        //     if(fast==slow){
        //         ListNode temp=slow;
        //         do{
        //             temp=temp.next;
        //             length++;
        //         }while(temp!=slow);
        //         break;
        //     }
        // }
        // ListNode f=head;
        // ListNode s=head;
        // if(length==0) return null;
        // while(length>0){
        //     s=s.next;
        //     length--;
        // }
        // while(f!=s)
        // {
        //     s=s.next;
        //     f=f.next;
        // }
        // return s;
    }
}