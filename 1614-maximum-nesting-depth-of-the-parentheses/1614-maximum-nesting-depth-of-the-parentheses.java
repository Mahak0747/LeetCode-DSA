class Solution {
    public int maxDepth(String s) {
        int max=Integer.MIN_VALUE;
        int n=0;
        for(char ch:s.toCharArray()){
            if(ch=='(')n++;
            else if(ch==')'){
                max=Math.max(n,max);
                n--;
            }
        }
        return Math.max(0,max);
    }
}