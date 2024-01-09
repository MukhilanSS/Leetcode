class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer>a=new HashMap<>();
        Map<Integer,Integer>b=new HashMap<>();
        for(int i:arr)
        a.put(i,a.getOrDefault(i,0)+1);
        for(int j:a.values()){
            if(b.containsKey(j))
                return false;
            b.put(j,0);
        }
        // Set<Integer>s=new HashSet<>(a.values());
        // return (a.size()==s.size());
        return true;
    }
}