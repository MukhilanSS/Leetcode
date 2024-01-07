class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int j=1,k=nums.length-1;
        Arrays.sort(nums);
        Set<List<Integer>> ans=new HashSet<>();
        for(int i=0 ;i<nums.length-2;i++){
            if(i>0 && nums[i] == nums[i - 1])
            continue;
            j=i+1;
            k=nums.length-1;
            while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            if(sum>0)
            k--;
            else if(sum<0)
            j++;
            else if(sum==0){
            ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
            j++;
            k--;
            }
            }
            
        }
        return new ArrayList(ans);
        
    }
}