class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer>st=new Stack<>();
        HashMap<Integer,Integer>map=new HashMap();
        for(int i:nums2)
        {
            while(!st.isEmpty() && i>st.peek())
            {
                map.put(st.pop(),i);
            }
            st.push(i);
        }
        int k=0;
        int ans[]=new int[nums1.length];
        for(int i:nums1)
        ans[k++]=map.getOrDefault(i,-1);
        return ans;
    }
}