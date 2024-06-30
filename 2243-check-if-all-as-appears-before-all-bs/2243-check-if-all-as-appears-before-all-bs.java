class Solution {
    public boolean checkString(String s) {
        if(!s.contains("b") || !s.contains("a")) return true;
        int a=s.indexOf("b");
        for(int i=a;i<s.length();i++)
        {
            if(s.charAt(i)=='a') return false;
        }
        return true;
    }
}   