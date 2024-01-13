class Solution {
    public String reverseOnlyLetters(String s1) {
        StringBuilder s=new StringBuilder(s1);
        int i=0,j=s.length()-1;
        while(i<j){
            if(!Character.isLetter(s.charAt(i))){
                i++;
            }
            else if(!Character.isLetter(s.charAt(j))){
                j--;
            }
            else{
                char temp=s.charAt(i);
                s.setCharAt(i,s.charAt(j));
                s.setCharAt(j,temp);
                i++;
                j--;
            }
        }
        return s.toString();
    }
}