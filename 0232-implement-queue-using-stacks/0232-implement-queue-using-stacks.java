class MyQueue {
    private Stack <Integer>a;
    private Stack <Integer>b;
    public MyQueue() {
     a=new Stack();
     b=new Stack();
    }
    
    public void push(int x) {
        a.push(x);
    }
    
    public int pop() {
        return a.remove(0);
    }
    
    public int peek() {
       
        return a.get(0);
    }
    
    public boolean empty() {
        if(a.isEmpty())
        return true;
        else 
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */