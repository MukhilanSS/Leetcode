class Solution {
    public void sortColors(int[] nums) {
    //     int a=0,b=0;
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         if(nums[i]==0)
    //         a++;
    //         else if(nums[i]==1)
    //         b++;
    //    }
    //    for(int i=0;i<a;i++)
    //    nums[i]=0;
    //    for(int i=a;i<a+b;i++)
    //    nums[i]=1;
    //    for(int i=a+b;i<nums.length;i++)
    //    nums[i]=2;
    int left=0,right=nums.length-1,k=0;
        while(k<nums.length && k<=right)
        {
            if(nums[k]==0)
            {
                int temp=nums[k];
                nums[k]=nums[left];
                nums[left]=temp;
                left++;
                k++;
            }
            else if(nums[k]==2)
            {
                int temp=nums[k];
                nums[k]=nums[right];
                nums[right]=temp;
                right--;
            }
            else
            k++;
        }
    }
        
}