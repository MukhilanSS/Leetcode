class Solution {
    public int maxProduct(int[] nums) {
     if(nums.length==1) return nums[0];
     int left=1,right=1,ans=0;
     for(int i=0;i<nums.length;i++)
     {
        if(left==0) left=1;
        if(right==0) right=1;
        left*=nums[i];
        right*=nums[(nums.length-1)-i];
        ans=Math.max(ans,Math.max(left,right));
     }
     return ans;   
    }
}