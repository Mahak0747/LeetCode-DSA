class Solution {
    public int minMoves(int target, int maxDoubles) {
        int c=0;
        while(maxDoubles!=0){
            if(target==1) break;
            if(target%2!=0)target--;
            else{
                target/=2;
                maxDoubles--;
            }
            c++;
        }
        return target+c-1;
    }
}