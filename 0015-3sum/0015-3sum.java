class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        Set<List<Integer>>ansList=new HashSet<>();
        Map<Integer,Integer>indexMap=new HashMap<>();
        for(int i=0;i<n;i++) indexMap.put(nums[i],i);
        // [-1,-1,0,1,2,4]  {-1:0,-1:1,0:3,1:4,2:5,4:6}
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int currSum=nums[i]+nums[j];
                if(indexMap.containsKey(-1*currSum))
                {
                    int k=indexMap.get(-1*currSum);
                    if(k>j)
                    ansList.add(Arrays.asList(nums[i],nums[j],nums[indexMap.get(-1*currSum)]));
                }
            }
        }
        return new ArrayList(ansList);
    }
}