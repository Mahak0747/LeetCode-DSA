class Solution {
    public int countRotations(String s, int k) {
        int n=s.length();
        int equal=0;
        for(int i = 0; i < n; i++){
            if (s.charAt(i) == s.charAt((i + 1) % n))equal++;
        }
        int diff=n-equal;
        if(k==equal)return diff;
        if(k==equal-1)return equal;
        return 0;
    }
}