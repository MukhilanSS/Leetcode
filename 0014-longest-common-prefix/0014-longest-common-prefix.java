class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i=0;
        Arrays.sort(strs);
        String a=strs[0];
        String b=strs[strs.length-1];
        while(i<a.length() && i<b.length()){
            if(a.charAt(i)==b.charAt(i))
            i++;
            else
            break;
        }
        return a.substring(0,i);
    }
}