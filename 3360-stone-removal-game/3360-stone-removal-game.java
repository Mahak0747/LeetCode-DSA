class Solution {
    public boolean canAliceWin(int n) {
        if(n<10)return false;
        n-=10;
        int prev=10;
        boolean a=false;
        while(n>=prev-1){
            prev--;
            n-=prev;
            a= !a;
        }
        return !a;
    }
}