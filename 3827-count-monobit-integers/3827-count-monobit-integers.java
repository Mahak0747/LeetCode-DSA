class Solution {
    public int countMonobit(int n) {
        int c=1;
        long val=1;
        while(val<=n){
            c++;
            val=val * 2 + 1;;
        }
        return c;
    }
}