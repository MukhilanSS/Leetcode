class Solution {
    public int maxProfit(int[] a) {
        int cur=a[0];
        int max=0,c;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<cur)
            {
                cur=a[i];
            }
            //1<7    cur=1;    5<1
            else
            {
                c=a[i]-cur;
                max=Math.max(c,max);
            }
        }
        return max;
    }
}