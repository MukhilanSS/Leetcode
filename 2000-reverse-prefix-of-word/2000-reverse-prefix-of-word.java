class Solution {
    public String reversePrefix(String word, char ch) {
        int n=word.indexOf(ch),i=0,j=n;
        StringBuilder s=new StringBuilder(word);
        while(i<j){
            char temp=word.charAt(i);
            s.setCharAt(i,s.charAt(j));
            s.setCharAt(j,temp);
            j--;
            i++;
        }
        return s.toString();
    }
}