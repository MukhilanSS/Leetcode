class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:nums)
        {
            max=Math.max(i,max);
            min=Math.min(i,min);
        }
        int ans=(max-k)-(min+k);
        return Math.max(0,ans);

    }
}