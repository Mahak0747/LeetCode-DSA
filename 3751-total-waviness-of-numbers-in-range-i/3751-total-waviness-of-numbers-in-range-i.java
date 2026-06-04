class Solution {
    private static int count(int n){
        String str=Integer.toString(n);
        int c=0;
        for(int i=1; i<str.length()-1; i++){
            if(str.charAt(i)>str.charAt(i-1) && str.charAt(i)>str.charAt(i+1))c++;
            if(str.charAt(i)<str.charAt(i-1) && str.charAt(i)<str.charAt(i+1))c++;
        }
        return c;
    }
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int i=num1; i<=num2; i++)ans+=count(i);
        return ans;
    }
}