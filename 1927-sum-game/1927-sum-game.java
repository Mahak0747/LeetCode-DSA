class Solution {
    public boolean sumGame(String num) {
        int mid=num.length()/2;
        int s1=0;
        int s2=0;
        int q1=0;
        int q2=0;
        for(int i=0; i<mid; i++){
            char l=num.charAt(i);
            char r=num.charAt(i+mid);
            if(l=='?')q1++;
            else s1+=l-'0';

            if(r=='?')q2++;
            else s2+=r-'0';
        }
        return (q1+q2)%2!=0 || (s1-s2)*2 != (q2-q1)*9;
    }
}