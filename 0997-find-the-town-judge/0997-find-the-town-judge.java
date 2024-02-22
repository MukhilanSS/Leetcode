class Solution {
    public int findJudge(int n, int[][] trust) {
        int a=trust.length;
        if(n==a)
        return -1;
        int arr[]=new int[n+1];
        int brr[]=new int[n+1];
        for(int i[]:trust)
        {
            arr[i[0]]++;
            brr[i[1]]++;
        }
        for(int i=1;i<=n;i++)
        {
         if(arr[i]==0 && brr[i]==n-1)
         return i;
        }
        
        return -1;
    }
}