class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length,i=0, j=n-1, k=n-1;
        int arr[]=new int[n];
        while(i<=j){
            int left=nums[i]*nums[i];
            int right=nums[j]*nums[j];
            if(left>right)
            {
                arr[k]=left;
                i++;
            }
            else if(left<=right)
            {
                arr[k]=right;
                j--;
            }
            k--;
        }
        return arr;
    }
}