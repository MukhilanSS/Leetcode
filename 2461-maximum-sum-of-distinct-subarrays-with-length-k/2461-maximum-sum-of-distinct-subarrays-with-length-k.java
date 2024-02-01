class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
     long sum=0,maxsum=0;
     Map<Integer,Integer>map=new HashMap<>();
     if(nums.length==1)
     return nums[0];
     for(int i=0;i<nums.length;i++)
     {
         map.put(nums[i],map.getOrDefault(nums[i],0)+1);
         sum+=nums[i];
         if(i>=k)
         {
             sum-=nums[i-k];
             map.put(nums[i-k],map.get(nums[i-k])-1);
             if(map.get(nums[i-k])==0)
             map.remove(nums[i-k]);
         }
         if(map.size()==k)
         maxsum=Math.max(maxsum,sum);
     }
     return maxsum;
    // //  for(int i:nums)
    //  for(int i=0;i<k;i++){
    //  map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    //  if(map.get(nums[i])==1)
    //  sum+=nums[i];
    //  else if(map.get(nums[i])>1 && nums.length==k)
    //  return 0;
    //  else 
    //  continue;
    //  }
    //  maxsum=sum;
     
    //  for(int i=k;i<nums.length;i++)
    //  {   
    //      map.put(nums[i],map.getOrDefault(nums[i],0)+1);        
    //      if(map.get(nums[i])== 1)
    //      { 
    //      sum+=nums[i]-nums[left++];
    //      maxsum=Math.max(sum,maxsum);
    //      }
    //  }   
    //  return maxsum;
    }
}