class Solution {
    public int countGroups(int[] position, int[] speed, int distance) {
        int n=position.length;
        long[] groupP=new long[n];
        long[] groupS=new long[n];
        int val=0;
        groupP[val]=position[n-1];
        groupS[val]=speed[n-1];
        val++;
        for(int i=n-1; i>=0; i--){
            long p=position[i];
            long s=speed[i];
            long RP=groupP[val-1];
            long RS=groupS[val-1];
            boolean add=false;
            if(RP-p<=distance)add=true;
            else if(s>RS)add=true;
            if(add)groupP[val-1]=p;
            else{
                groupP[val]=p;
                groupS[val]=s;
                val++;
            }
        }
        return val;
    }
}