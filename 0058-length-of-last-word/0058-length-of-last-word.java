class Solution {
    public int lengthOfLastWord(String s) {
        s.trim();
        String s1[]=s.split(" ");
        int a=s1.length-1;
        int b=s1[a].length();
        return b;
    }
}