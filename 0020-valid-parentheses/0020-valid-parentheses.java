class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='{' || ch=='(' || ch=='[')
                st.push(ch);
            else {
                if (st.isEmpty()) {
                    System.out.println("hi");
                    return false;
                }
                char top = st.pop();
                if ((ch == '}' && top != '{') || (ch == ')' && top != '(') || (ch == ']' && top != '[')) {
                    System.out.println("hjiji");
                    
                    return false;
                }
        }  
        }
       return st.isEmpty(); 
    

}
}