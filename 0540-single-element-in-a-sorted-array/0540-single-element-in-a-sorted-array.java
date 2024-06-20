class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start=0,end=nums.length-1;
        while(start<end)
        {
            int mid=(start+end)/2;
            int last=mid;
            if(nums[mid]==nums[mid-1]) last=mid;
            else if(nums[mid]==nums[mid+1]) last=mid+1;
            else return nums[mid];
            if(last%2!=0) start=last+1;
            else end=last-2;
        }
    return nums[end];
    }
}