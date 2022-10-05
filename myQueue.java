class MyQueue {
    private Stack <Integer> s1 = new Stack <Integer>();
    private Stack <Integer> s2 = new Stack <Integer>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        // Move all elements from s1 to s2
         while (!s1.isEmpty()){
            s2.push(s1.pop());
        }

        int x = s2.peek();
        s2.pop();

        // Push everything back to s1
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }

        return x;       
    }
    
    public int peek() {
        // Move all elements from s1 to s2
         while (!s1.isEmpty()){
            s2.push(s1.pop());
        }

        int y = s2.peek();
 
        // Push everything back to s1
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return y;
    }
    
    public boolean empty() {
        return s1.empty();
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