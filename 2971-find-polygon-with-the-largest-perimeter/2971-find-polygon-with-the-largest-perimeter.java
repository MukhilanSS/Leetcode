class Solution {
    public long largestPerimeter(int[] nums) {
        int n=nums.length;
        long sum=0;
        Arrays.sort(nums);
        long ans=-1;
        sum=nums[0]+nums[1];
        for(int i=2;i<n;i++)
        {
            if(sum>nums[i])
            ans=sum+nums[i];
            sum+=nums[i];

        }
        return ans;
    }
}