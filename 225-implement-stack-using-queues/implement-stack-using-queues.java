class MyStack {
    Queue<Integer> q;
    public MyStack() {
        q=new ArrayDeque<>();
    }
    
    public void push(int x) {
        q.offer(x);
    }
    
    public int pop() {
        int s=q.size();
        for(int i=1;i<s;i++){
            int ele=q.poll();
            q.offer(ele);
        }
        return q.poll();
    }
    
    public int top() {
        int s=q.size();
        for(int i=1;i<s;i++){
            int ele=q.poll();
            q.offer(ele);
        }
        int peek=q.peek();
        q.offer(q.poll());
        return peek;
    }
    
    public boolean empty() {
        return q.isEmpty();
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