class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        // int a[]=new int[26];
        // for(int i=0;i<n;i++)
        // a[s.charAt(i)-'a']++;
        // for(int i=0;i<n;i++){
        //     if(a[s.charAt(i)-'a']==1)
        //     return i;
        // }
        Map<Character,Integer>a=new HashMap<>();
        for(char c:s.toCharArray())
        a.put(c,a.getOrDefault(c,0)+1);
        for(int i=0;i<n;i++){
            if(a.get(s.charAt(i))==1)
            return i;
        }
        return -1;
    }
}