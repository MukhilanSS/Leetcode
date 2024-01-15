class Solution {
    public int[] twoSum(int[] a, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        int arr[]=new int[2];
        int n=a.length;
        for(int i=0;i<n;i++){
            int diff=target-a[i];
            if(map.containsKey(diff)){
                arr[0]=map.get(diff);
                arr[1]=i+1;
                break;
            }
            map.put(a[i],i+1);
        }
        return arr;
    }
}