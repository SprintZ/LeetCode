class MinStack {
    ArrayList<Integer> stack = new ArrayList<Integer>();
    ArrayList<Integer> minStack = new ArrayList<Integer>();
    public void push(int x) {
        stack.add(x);
        if(minStack.isEmpty() || x<=minStack.get(minStack.size()-1)) {
            minStack.add(x);
        }
    }

    public void pop() {
        if(stack.isEmpty())  
        {  
            return;  
        }
        int rem = stack.remove(stack.size()-1);
        if(!minStack.isEmpty() && rem == minStack.get(minStack.size()-1)) {
            minStack.remove(minStack.size()-1);
        }
    }

    public int top() {
       int rem = stack.get(stack.size()-1);
       return rem;
    }

    public int getMin() {
        if(!minStack.isEmpty()) {
            return minStack.get(minStack.size()-1);
        }
        return 0;
        
    }
}