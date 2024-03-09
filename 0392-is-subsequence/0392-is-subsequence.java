class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();
        if(s.isEmpty() )
        return true;
        while(i<t.length())
        {
            if(b[i]==a[j]){
            j++;
            }
            i++;
            if(j==s.length())
            return true;
        }
        return false;
    }
}