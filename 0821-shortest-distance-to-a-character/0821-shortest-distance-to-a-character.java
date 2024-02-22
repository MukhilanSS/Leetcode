class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer>a=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
            a.add(i);
        }
        int ans[]=new int[s.length()];
        for(int i=0;i<ans.length;i++)
        {
            int max=10000;
            for(int j:a)
                max=Math.min(max,Math.abs(i-j));
            ans[i]=max;
        }
        return ans;
    }
}