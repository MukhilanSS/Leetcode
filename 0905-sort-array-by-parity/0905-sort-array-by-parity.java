class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int k=0,l=nums.length-1;
        int ans[]=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]%2==0)
            {
                ans[k++]=nums[i];
            }
            else
            ans[l--]=nums[i];
        }

        return ans;
    }
}