class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long c=0;
        int team=0;
        for(int n:nums){
            if(n==0){
                c++;
                if(team!=0)c+=team;
                team++;
            }
            else team=0;
        }
        return c;
    }
}