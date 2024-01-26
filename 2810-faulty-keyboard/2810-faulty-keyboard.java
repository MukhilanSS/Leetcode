class Solution {
    public String finalString(String s) {
        StringBuilder s1=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='i'){
                s1.reverse();
            }
            else{
                s1.append(c);
            }
        }
        return s1.toString();
    }
}