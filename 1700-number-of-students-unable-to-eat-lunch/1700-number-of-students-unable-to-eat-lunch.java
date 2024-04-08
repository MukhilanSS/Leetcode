class Solution {
    public int countStudents(int[] students, int[] s) {
        Queue<Integer>arr=new LinkedList<>();
        Stack<Integer>st=new Stack<>();
        for(int i=s.length-1;i>=0;i--)
        st.push(s[i]);
        for(int i:students)
        arr.add(i);
        int count=0;
        while(count<st.size() && !arr.isEmpty())
        {
            if(arr.peek()==st.peek())
            {
                st.pop();
                arr.poll();
                count=0;
            }
            else
            {
                arr.add(arr.peek());
                arr.poll();
                count++;
            }
        }
        return arr.size();
    }
}

