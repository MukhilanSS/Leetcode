class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double cur=0,max=0;
        for(int i=0;i<k;i++)
            cur+=nums[i];
        max=cur;
        int left=0;
        for(int i=k;i<nums.length;i++)
        {
            cur+=nums[i]-nums[i-k];
            max=Math.max(cur,max);
        }
        return max/k;
    }
}
// class Solution {
//     public double findMaxAverage(int[] nums, int k) {
//         int left=0,right=0;
//         double cur=0,max=0;
//         while(right<nums.length)
//         {
//             cur+=nums[right];
//             max=cur;
//             while(right-left+1>k)
//             {
//                 cur-=nums[left++];
//             }
//             max=Math.max(cur,max);
//             right++;
//         }
//         return max/k;
//     }
// }