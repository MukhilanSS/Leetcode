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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int ans[][]=new int[m][n];
        int count=1;
        int top=0,down=m-1,left=0,right=n-1;
        
        for(int []row:ans)
        Arrays.fill(row,-1);
        while(top<=down && left<=right && head!=null){
            for(int i=left;i<=right && head!=null;i++)
            {
                ans[top][i]=head.val;
                head=head.next;
            }
            top++;
            for(int i=top;i<=down&&head!=null;i++)
            {
                ans[i][right]=head.val;
                head=head.next;
            }
            right--;
            if(top<=down)
            {
                for(int i=right;i>=left&&head!=null;i--)
                {
                    ans[down][i]=head.val;
                head=head.next;
                }
                down--;
            }
            if(left<=right)
            {
                for(int i=down;i>=top&&head!=null;i--)
                {
                    ans[i][left]=head.val;
                head=head.next;
                }
                left++;
            }

        }
        return ans;
    }
}