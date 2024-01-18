class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int left[]=new int[n+1];
        left[0]=0;
        for(int i=1;i<n+1;i++)
        {
            left[i]=left[i-1]+gain[i-1];
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n+1;i++)
        {
            if(left[i]>max)
            {
                max=left[i];
            }
        }
        return max;
    }
}