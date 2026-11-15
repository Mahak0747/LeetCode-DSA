class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        int cE = 0;
        int cO = 0;
        int pre = 0; 
        int mod = (int)1e9 + 7;
        int ans = 0;
        for(int i = 0; i < n;i++){
            pre += arr[i];
            if(pre%2 == 0){ 
                ans = (ans + cO) % mod;
                cE++;
            }else{
                ans = (ans + cE) % mod;
                ans++;
                cO++;
            }
        }
        return ans;
    }
}