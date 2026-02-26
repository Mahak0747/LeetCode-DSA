class Solution {
    public int numSteps(String s) {
        int val=0;
        int pow=0;
        for(int i=s.length()-1; i>0; i--){
            int dig=s.charAt(i)-'0';
            if(dig+pow==1){
                val+=2;
                pow=1;
            }
            else val+=1;
        }
        return val+pow;
    }
}