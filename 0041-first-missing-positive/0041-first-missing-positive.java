class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<0)
            nums[i]=0;
        }
        for(int i=0;i<n;i++)
        {
            int val=Math.abs(nums[i])-1;
            if(val<0 || val>=n)
            continue;
            if(nums[val]>0)
            {
                nums[val]*=-1;
            }
            else if(nums[val]==0)
            {
                nums[val]=Integer.MIN_VALUE+1;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]>=0)
            return i+1;
        }
        return n+1;
    }
}