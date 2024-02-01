class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int ans[][]=new int[n/3][3];
        int idx=0;
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                ans[i][j]=nums[idx++];
                if((ans[i][2]-ans[i][0])>k)
                    return new int[0][0];
            }
        }
        return ans;
    }
}