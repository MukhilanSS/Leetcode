class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length-1;
        int min=Integer.MAX_VALUE;
        // Arrays.sort(nums);
        for(int a:nums)
        min=Math.min(a,min);
        int steps=0;
        for(int a:nums)
        {
            steps+=Math.abs(a-min);
        }
        return steps;
    }
}