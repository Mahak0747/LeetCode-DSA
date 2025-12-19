class Solution {
    public String removeOuterParentheses(String s) {
        int l=s.length();
        if(l<=2)return "";
        char[] arr=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        int open=0;
        for(int i=0; i<l; i++){
            if(arr[i]=='('){
                open++;
                if(open>1)sb.append('(');
            }
            else{
                if(open>1)sb.append(')');
                open--;
            }
        }
        return sb.toString();
    }
}