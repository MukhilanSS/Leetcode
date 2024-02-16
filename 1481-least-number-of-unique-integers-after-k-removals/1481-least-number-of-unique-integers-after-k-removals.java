class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:arr)
        map.put(i,map.getOrDefault(i,0)+1);
        List<Integer>freq=new ArrayList<>(map.values());
        Collections.sort(freq);
        int count=freq.size();
        for(int i:freq)
        {
            if(k>=i)
            {
                k=k-i;
                count--;
            }
            else
            break;
        }
        return count;
    }
}