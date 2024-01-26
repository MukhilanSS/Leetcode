class Solution {
    public String reverseVowels(String s) {
        int i=0,j=s.length()-1;
        StringBuilder s1=new StringBuilder(s);
        while(i<j){
            char a=s1.charAt(i);
            char b=s1.charAt(j);
            if("aeioAEIOUu".indexOf(""+a)>=0 && "aeioAEIOUu".indexOf(""+b)>=0)
            {
            s1.setCharAt(i,b);
            s1.setCharAt(j,a);
            i++;
            j--;
        }
        else
        {
            if("aeiouAEIOU".indexOf(""+a)<0)
            i++;
            if("aeiouAEIOU".indexOf(""+b)<0)
            j--;
        }
        }
        return s1.toString();
    }
}