class Solution {
    public int[] intersection(int[] a, int[] b) {
        Set<Integer>s1=new HashSet<>();
        Set<Integer>s2=new HashSet<>();
        for(int i:a)
        s1.add(i);
        for(int i:b){
            if(s1.contains(i))
            s2.add(i);
        }
        int[] arr = new int[s2.size()];
        Iterator<Integer> iterator = s2.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            arr[index++] = iterator.next();
        }
        return arr;
    }
}