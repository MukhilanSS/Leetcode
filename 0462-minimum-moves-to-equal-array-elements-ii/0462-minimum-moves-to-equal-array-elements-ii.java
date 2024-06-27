class Solution {
    public int minMoves2(int[] nums) {
        int i=0,j=nums.length-1;
        int steps=0;
        Arrays.sort(nums);
        while(i<=j)
        {
            steps+=Math.abs(nums[j]-nums[i]);
            i++;
            j--;
        }
        return steps;
    }
}