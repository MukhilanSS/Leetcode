class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans=0,cur=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i:nums)
        {
            cur+=i;
            if(map.containsKey(cur-k))
            {
                ans+=map.get(cur-k);
            }
            map.put(cur,map.getOrDefault(cur,0)+1);
        }
        return ans;
    }
}
