class Solution {
    private static int pro(int n){
        int pro=1;
        while(n>0){
            pro*=n%10;
            n/=10;
        }
        return pro;
    }
    public int smallestNumber(int n, int t) {
        for(int i=n; i<=n*t; i++){
            if(pro(i)%t==0)return i;
        }
        return -1;
    }
}