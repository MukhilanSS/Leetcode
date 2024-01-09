class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer>a=new HashMap<>();
        for(int i:arr)
        a.put(i,a.getOrDefault(i,0)+1);
        Set<Integer>s=new HashSet<>(a.values());
        return (a.size()==s.size());
    }
}