class MyStack {
    Queue<Integer> q;
    public MyStack() {
        q= new LinkedList<>();
    }
    
    public void push(int x) {
        Queue<Integer> temp = new LinkedList<>();
        while(!q.isEmpty()){
            int a = q.poll();
            temp.add(a);
        }
        q.add(x);
        while(!temp.isEmpty()){
            int a = temp.poll();
            q.add(a);
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        if(q.isEmpty()) return true;
        else return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */