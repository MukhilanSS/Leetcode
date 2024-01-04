class Solution {
    public String reverseWords(String s) {
        String s1[]=s.split(" ");
        StringBuilder s2=new StringBuilder();
        for(String a:s1){
            StringBuilder ss=new StringBuilder(a);
            int i=0,j=ss.length()-1;
            while(i<j){
                char temp=ss.charAt(i);
                ss.setCharAt(i,ss.charAt(j));
                ss.setCharAt(j,temp);
                i++;
                j--;
            }
            s2.append(ss+" ");
        }
        return s2.toString().trim();
    }
}