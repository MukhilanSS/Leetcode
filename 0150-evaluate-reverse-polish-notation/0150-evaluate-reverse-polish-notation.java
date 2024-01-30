class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> st=new Stack<>();
        for (String s : tokens) {
        String add = "+";
        String sub = "-";
        String mul = "*";
        String div = "/";
        if (s.equals(add) || s.equals(sub) || s.equals(mul) || s.equals(div)) {
            int b = st.pop();
            int a = st.pop();
            st.push(solve(a, b, s));
        } 
        else{
                st.push(Integer.parseInt(s));
            }
        }

        return st.peek();
    }

    int solve(int a,int b,String s){
        if(s.equals("+"))
        return a+b;
        else if(s.equals("-"))
        return a-b;
        else if(s.equals("*"))
        return a*b;
        else if(s.equals("/"))
        return a/b;
        return 0;
        }
}
// class Solution {
//     public int evalRPN(String[] tokens) {
//         int[] stack = new int[tokens.length];
//         int top = 0;
//         for(String s : tokens) {
//             char c = s.charAt(0);
//             if(c=='+') {
//                 int b = stack[--top];
//                 int a = stack[--top];
//                 stack[top++] = a+b;
//             } else if(c=='-' && s.length()==1) {
//                 int b = stack[--top];
//                 int a = stack[--top];
//                 stack[top++] = a-b;
//             } else if(c=='*') {
//                 int b = stack[--top];
//                 int a = stack[--top];
//                 stack[top++] = a*b;
//             } else if(c=='/') {
//                 int b = stack[--top];
//                 int a = stack[--top];
//                 stack[top++] = a/b;
//             } else 
//                 stack[top++] = Integer.parseInt(s);
//         }
//         return stack[0];
//     }
// }