class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left=0,right=0,ans=0,curr=1;
        if(k==0 || k==1)
        return 0;
        while(right<nums.length){
            curr*=nums[right];
            while(curr>=k && left<nums.length)
            {
                curr=curr/(nums[left++]);
            }
            ans=ans+right-left+1;
            right++;
        }
    return ans;
    }
}