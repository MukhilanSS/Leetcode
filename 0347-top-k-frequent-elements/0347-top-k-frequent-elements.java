class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        PriorityQueue<Integer>heap=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet())
        {
            heap.add(i);
        }
        int l=0;
        int ans[]=new int[k];
        while(k!=0)
        {
            ans[l++]=heap.poll();
            k--;
        }
        return ans;
    }
}