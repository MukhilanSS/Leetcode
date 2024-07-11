class Solution {
    public int longestValidParentheses(String s) {
        int open=0,close=0,max=0;
        for(char c:s.toCharArray())
        {
            if(c=='(') open++;
            else close++;
            if(open==close)
            {
                max=Math.max(open+close,max);
            }
            else if(close>open)
                open=close=0;
        }
        open=close=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='(') open++;
            else close++;
            if(open==close)
            {
                max=Math.max(open+close,max);
                // open=close=0;
            }
            else if(open>close)
                open=close=0;

        }
        return max;
    }
}