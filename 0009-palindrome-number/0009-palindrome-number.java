class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        } 
        int val=0;
        int temp=x;
        while(x>0){
            int rem=x%10;
            val=(val*10)+rem;
            x/=10;
        }
        return val==temp;
        // String str=Integer.toString(x);
        // int n=str.length();
        // for(int i=0; i<n; i++){
        //     if(str.charAt(i)!=str.charAt(n-i-1)){
        //         return false;
        //     }
        // }
        // return true;
    }
}