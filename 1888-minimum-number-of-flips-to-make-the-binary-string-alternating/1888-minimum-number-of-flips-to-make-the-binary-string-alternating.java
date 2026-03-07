class Solution {
    public int minFlips(String s) {
        int n = s.length();
        String str = s + s;
        StringBuilder alt1 = new StringBuilder();
        StringBuilder alt2 = new StringBuilder();
        for(int i = 0; i < 2*n; i++){
            if(i % 2 == 0){
                alt1.append('0');
                alt2.append('1');
            } else {
                alt1.append('1');
                alt2.append('0');
            }
        }
        int res = Integer.MAX_VALUE;
        int diff1 = 0, diff2 = 0;
        int l = 0;
        for(int i = 0; i < 2*n; i++){
            if(str.charAt(i) != alt1.charAt(i)) diff1++;
            if(str.charAt(i) != alt2.charAt(i)) diff2++;
            if(i - l + 1 > n){
                if(str.charAt(l) != alt1.charAt(l)) diff1--;
                if(str.charAt(l) != alt2.charAt(l)) diff2--;
                l++;
            }
            if(i - l + 1 == n){
                res = Math.min(res, Math.min(diff1, diff2));
            }
        }
        return res;
    }
}