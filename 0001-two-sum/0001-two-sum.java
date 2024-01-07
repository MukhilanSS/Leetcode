class Solution {
    public int[] twoSum(int[] nums, int target) {
    int i=0,j=i+1;
    while(i<j && i<nums.length && j<nums.length)
    {
        if(nums[i]+nums[j]==target){
            break;
         }
        j++;
        if(j==nums.length)
        {
            i++;
            j=i+1;
        }
    }
    return new int[]{i,j};
    }
   
}