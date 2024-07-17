class Solution {
    public boolean canJump(int[] nums) {
        int maxlen=0;

        for(int i=0;i<nums.length;i++)
        {
            if(i>maxlen) return false;
            maxlen=Math.max(maxlen,i+nums[i]);
        }
        return true;
    }
}