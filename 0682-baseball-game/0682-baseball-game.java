class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0; i<operations.length; i++){
            String op = operations[i];
            if(op.equals("D")){
                stack.push(stack.peek()*2);
                continue;
            }
            else if(op.equals("C")){
                stack.pop();
                continue;
            }
            else if(op.equals("+")){
                if (stack.size() >= 2) {
                    int top = stack.pop();
                    int newTop = top + stack.peek();
                    stack.push(top);       
                    stack.push(newTop); 
                    continue;
                }
            }
            else {
                stack.push(Integer.parseInt(op));
            }
        }
        int ans=0;
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        return ans;
    }
}