class Solution {
    public int lengthOfLongestSubstring(String s) {
    //   Map a=new HashMap();
    //   int l=0,max=0;
    //   for(int r=0;r<s.length();r++){
    //       while(a.containsKey(s.charAt(r)))
    //         {
    //             a.remove(s.charAt(l));
    //             l++;
    //         }
    //         a.put(s.charAt(r),0);
    //         max=Math.max(max,a.size());
    //   }  
    // return max;
        Map<Character,Integer> map=new HashMap<>();
        int left=0,right=0,length=0,n=s.length();
        while(right<n){
            if(map.containsKey(s.charAt(right)))
                left=Math.max(map.get(s.charAt(right))+1,left);
            map.put(s.charAt(right),right);
            length=Math.max(length,right-left+1);
            right++;
        }
        return length;
    }
}