class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE,curmax=0;
        for(int i=0;i<nums.length;i++)
        {
            curmax+=nums[i];
            if(curmax>max)
            {
                max=curmax;
            }
            if(curmax<0)
            curmax=0;
        }
        return max;
    }
}