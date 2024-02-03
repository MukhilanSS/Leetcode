class Solution {
    public char findTheDifference(String s, String t) {
        int []a=new int[26];
        int []b=new int[26];
        for(char c:s.toCharArray())
        a[c-'a']++;
        for(char c:t.toCharArray())
        b[c-'a']++;
        char c='a';
        for(int i=0;i<26;i++)
        {
            if(a[i]!=b[i])
            {
                c=(char)(i+97);
            }
        }

        return c;
    }
}