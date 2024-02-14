class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[]=new int[nums.length];
        int p=0,n=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                ans[p]=nums[i];
                p+=2;
            }
            else
            {
                ans[n]=nums[i];
                n+=2;
            }
        }
        // List<Integer>l=new ArrayList<>();
        // List<Integer>a=new ArrayList<>();
        // int n=nums.length;
        // for(int i=0;i<n;i++)
        // {
        //     if(nums[i]>0)
        //     l.add(nums[i]);
        // }
        // for(int i=0;i<n;i++)
        // {
        //     if(nums[i]<0)
        //     l.add(nums[i]);
        // }
        // int i=0,n1=n/2;
        // while(i<n1 && n1<n)
        // {
        //     a.add(l.get(i++));
        //     a.add(l.get(n1++));
        // }
        // int x=0;
        // for(int k:a)
        // {
        //     ans[x++]=k;
        // }
    return ans;
    }
}