class Solution {
    public boolean isBalanced(String num) {
        int odd=0;
        int even=0;
        for(int i=0; i<num.length(); i++){
            if(i%2==0)odd+=(num.charAt(i)-'0');
            else even+=(num.charAt(i)-'0');
        }
        return odd==even;
    }
}