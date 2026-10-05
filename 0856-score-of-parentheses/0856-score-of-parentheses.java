class Solution {
    public int scoreOfParentheses(String str) {
        Stack<Integer> st=new Stack<>();
        int ans=0;
        for(char ch:str.toCharArray()){
            int val=0;
            if(ch=='(') st.push(0);
            else{
                while(st.peek()!=0) val+=st.pop();
                val=Math.max(2*val,1);
                st.pop();
                st.push(val);
            }
        }
        while(!st.isEmpty()) ans+=st.pop();
        return ans;
    }
}