class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxOnes=0,left=0,right=0,n=nums.length,zeros=0;
        while(right<n)
        {
            if(nums[right]==0) zeros++;
            if(zeros>k)
            {
                if(nums[left]==0)   zeros--;
                left++;
            }
            if(zeros<=k)   
                 maxOnes=Math.max(maxOnes,right-left+1);
            right++;
        }
        return maxOnes;
    }
}