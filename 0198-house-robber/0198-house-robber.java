class Solution {
     public int climb(int n,int nums[],Map<Integer,Integer>memo)
    {
        if(n==0)
        return 0;
        if(n==1)
        return nums[0];
        if(n==2)
        return Math.max(nums[0],nums[1]);
        if(memo.containsKey(n))
        return memo.get(n);
        int result=Math.max(climb(n-1,nums,memo),climb(n-2,nums,memo)+nums[n-1]);
        memo.put(n,result);
        return result;
    }
    public int rob(int[] nums) {
        return climb(nums.length,nums,new HashMap<>());
    }
}



// class Solution {
//     public int rob(int[] nums) {
//         int n=nums.length;
//         if(n==0)
//         return 0;
//         else if(n==1)
//         return nums[0];
//         else if(n==2)
//         return Math.max(nums[0],nums[1]);              
//         int a[]=new int[n];
//         a[0]=nums[0];
//         a[1]=Math.max(nums[1],nums[0]);
//         for(int i=2;i<n;i++)
//         a[i]=Math.max(a[i-1],a[i-2]+nums[i]);
//         return a[n-1];
//     }
// }