class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char r[]=new char[26];
        char m[]=new char[26];
        for(char i:ransomNote.toCharArray())
        r[i-'a']++;
        for(char i:magazine.toCharArray())
        m[i-'a']++;
        for(int i=0;i<26;i++)
        {
            if(r[i]>m[i] || m[i]<r[i]) 
            {
                return false;
            }
        }
        return true;
    }
}