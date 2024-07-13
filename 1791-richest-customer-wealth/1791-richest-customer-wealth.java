class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum,max=0;
        for(int a[]:accounts)
        {
            sum=0;
            for(int i:a)
            {
                sum+=i;
            }
            max=Math.max(max,sum);
        }
        return max;
        
    }
}