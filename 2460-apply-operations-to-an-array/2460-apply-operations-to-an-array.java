class Solution {
    public int[] applyOperations(int[] nums) {
        // int i=0,j=1;
        // while(i<nums.length && j <nums.length){
        //     if(nums[i]!=nums[j]){
        //         i++;
        //         j=i+1;
        //     }
        //     else if(nums[i]==nums[j] && nums[i]!=0 && nums[j]!=0){
        //         nums[i]=nums[i]*2;
        //         nums[j]=0;
        //         i++;
        //         j=i+1;
        //     }
        //     else{
        //         i++;
        //         j=i+1;
        //     }
        // }
       for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        } 
        
        int k=0;
        for(int l=0;l<nums.length;l++){
            if(nums[l]!=0){
                int temp=nums[l];
                nums[l]=nums[k];
                nums[k]=temp;
                k++;
            }
        }
        return nums;
    }
}