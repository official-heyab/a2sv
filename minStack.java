class MinStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> mn=new Stack<>();

    public MinStack() {

    }
    
   
    public void push(int x){
        if(st.empty() || x<=mn.peek())
            mn.push(x);
        st.push(x);
    }
    
    public void pop(){
        if(st.peek().equals(mn.peek())) 
            mn.pop();
        st.pop();
    }
    
    public int top(){
         return st.peek();
    }
    
    public int getMin() {
        return mn.peek();
    }

   
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */