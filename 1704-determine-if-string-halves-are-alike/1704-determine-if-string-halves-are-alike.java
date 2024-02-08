class Solution {
    public boolean halvesAreAlike(String s) {
        String s1="";
        String s2="";
        int count=0,count1=0;
        for(int i=0;i<s.length()/2;i++)
        {
            s1=s1+s.charAt(i);
            if(("AEIOUaeiou").indexOf(s.charAt(i))>=0)
            count++;
        }
        System.out.println(count);
        for(int i=s.length()/2;i<s.length();i++)
        {
            s2=s2+s.charAt(i);
            if(("AEIOUaeiou").indexOf(s.charAt(i))>=0)
            count1++;
        }
        // System.out.println(count);
        if(count==count1)
        return true;
        return false;
    }
}