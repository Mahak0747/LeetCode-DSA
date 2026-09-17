class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int p[]=new int[26];
        int w[]=new int[26];
        int l=0;
        int k=s1.length();
        for(int i=0;i<k;i++){
            char ch=s1.charAt(i);
            p[ch-'a']++;
        }
        for(int r=0;r<s2.length();r++){
            char chr=s2.charAt(r);
            w[chr-'a']++;
            if(r-l+1==k){
                if(Arrays.equals(p,w))return true;
                char chl=s2.charAt(l);
                w[chl-'a']--;
                l++;
            }
        }
        return false;
    }
}