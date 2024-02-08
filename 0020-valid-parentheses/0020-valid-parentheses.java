class Solution {
    public boolean isValid(String s) {
        Map<Character,Character>map=new HashMap<>();
        Stack<Character>st=new Stack<>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');
        for(char c:s.toCharArray())
        {
            if(!st.isEmpty() && map.containsKey(c) && map.get(c)==st.peek())
            st.pop();
            else
            st.push(c);
        }
        if(!st.isEmpty())
        return false;
        return true;
    }
}