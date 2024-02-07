class Solution {
public String frequencySort(String s) {
int b[]=new int[128];
    for (char c : s.toCharArray())
        b[c]++;
    StringBuilder s1=new StringBuilder();
    for(int i=s.length();i>=0;i--)
    {
        for(char ch=48;ch<128;ch++)
        {
            if (b[ch]==i) {
            for (int j=0;j<i;j++)
            s1.append(ch);
            }
        }
    }
    return s1.toString();
}
}
