class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        for(int i=0; i<apple.length; i++){
            sum+=apple[i];
        }
        Arrays.sort(capacity);
        int i=capacity.length-1;
        int ans=0;
        while(i>=0 && sum>0){
            sum-=capacity[i];
            ans++;
            i--;
        }
        return ans;
    }
}