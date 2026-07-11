class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum=0;
        for(int i=0; i<timeSeries.length-1; i++){
            if(timeSeries[i] + duration-1>=timeSeries[i+1])sum+=timeSeries[i+1] - timeSeries[i];
            else{
                sum+=duration;
            }
        }
        sum+=duration;
        return sum;
    }
}