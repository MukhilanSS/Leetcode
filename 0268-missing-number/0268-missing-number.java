class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int a[]=new int[n+1];
        for(int i=0;i<n;i++){
            a[nums[i]]++;
        }
        for(int i=1;i<=n;i++){
            if(a[i]==0)
            return i;
        }
        return 0;
    }
}