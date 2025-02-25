class Solution {
    public int findPairs(int[] nums, int k) {
        int i=0,j=1,n=nums.length;
        int count=0;
        Arrays.sort(nums);
        HashMap<Integer,Integer> map=new HashMap<>();
        while(i<n && j<n){
            int a=nums[i],b=nums[j],diff=Math.abs(a-b);
            if(diff==k)
            {
                if(!map.containsKey(a))
                {
                    map.put(a,b);
                    count++;
                }
                i++;
                j=i+1;

            }
            else if(k>diff)
            {
                j++;
                
            }
            else if(k<diff){
                i++;
                j=i+1;
            }
        }
        return count;
    }
}