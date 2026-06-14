class Solution {
    public int digitFrequencyScore(int n) {
        int[] arr=new int[10];
        while(n>0){
            arr[n%10]++;
            n/=10;
        }
        int sum=0;
        for(int i=0; i<10; i++){
            sum+=i*arr[i];
        }
        return sum;
    }
}