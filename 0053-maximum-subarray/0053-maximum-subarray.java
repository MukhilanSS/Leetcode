class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE,curmax=0;
        for(int i:nums)
        {
            curmax+=i;
            if(curmax>max) max=curmax;
            if(curmax<0) curmax=0;
        }
        return max;
    }
}