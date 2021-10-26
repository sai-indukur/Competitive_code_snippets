//155. Min Stack LeetCode
class MinStack {
    Stack<Integer> s;
    Stack<Integer> m;

    /** initialize your data structure here. */
    public MinStack() 
    {
        s=new Stack<Integer>();
        m=new Stack<Integer>();
    }
    
    public void push(int val) {
        
        if(s.isEmpty())
        {
            s.push(val);
            m.push(val);
        }
        else
        {
            if(val<m.peek())
            {
                m.push(val);
                s.push(val);
            }
            else
            {
                s.push(val);
                m.push(m.peek());
            }
        }
    }
    
    public void pop() {
        s.pop();
        m.pop();
    }
    
    public int top() {
        
        return s.peek();
    }
    
    public int getMin() {
        return m.peek();
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
