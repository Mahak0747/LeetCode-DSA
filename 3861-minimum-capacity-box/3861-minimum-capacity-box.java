class Solution {
    public int minimumIndex(int[] num, int x) {
        int min=Integer.MAX_VALUE;
        int val=-1;
        for(int i=0; i<num.length; i++){
            if(num[i]>=x){
                if(min>num[i]){
                    min=num[i];
                    val=i;
                }
            }
        }
        return val;
    }
}