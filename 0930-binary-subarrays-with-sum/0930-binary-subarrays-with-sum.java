class Solution {
        public int numSubarraysWithSum(int[] nums, int goal) {
            return num(nums,goal)-num(nums,goal-1);
            }
    public int num(int[] nums, int goal) {
        int n=nums.length,count=0,sum=0,i=0;
        for(int j=0;j<n;j++)
        {
            sum+=nums[j];
            while(i<=j && sum>goal)
            {
                sum-=nums[i++];
                // System.out.println(sum+" "+i+" "+j);
            }
            count+=j-i+1;
        }
     return count;   
    }
}