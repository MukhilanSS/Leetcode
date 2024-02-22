class Solution {
    public String mergeAlternately(String s1, String s2) {
        int i=0,j=0;
        StringBuilder a=new StringBuilder();
        // StringBuffer a=new StringBuffer();
        // String b="";
        int n=s1.length(),m=s2.length();
        while(i<n && j<m)
        {
            // b+=s1.charAt(i);
            // b+=s2.charAt(j);
            a.append(s1.charAt(i));
            a.append(s2.charAt(j));
            i++;
            j++;
        }
        while(i<n){
        // b+=s1.charAt(i);
        a.append(s1.charAt(i));
        i++;
        }
        while(j<m){
        a.append(s2.charAt(j));
        // b+=s2.charAt(j);
        j++;
        }
        return a.toString();
    }
}