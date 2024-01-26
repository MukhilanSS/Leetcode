class Solution {
    public String makeSmallestPalindrome(String s1) {
        char str[] = s1.toCharArray();
        int i=0, j=s1.length()-1;
        while(i<j){
            str[i] = (char)Math.min(str[i],str[j]);
            str[j]= str[i];
            i++;
            j--;
        }
        return new String(str);
    }
}