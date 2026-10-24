class Solution {
    public int countMagicalPairs(String s) {
        int n=s.length();
        int ans=0;
        for(int j=0; j<n-1; j++){
            int[] left=new int[26];
            int lenl=0;
            int[] freq=new int[27];
            for(int i=j; i>=0; i--){
                int idx=s.charAt(i)-'a';
                if(left[idx]==0)lenl++;
                left[idx]++;
                freq[lenl]++;
            }
            int[] right=new int[26];
            int lenr=0;
            for(int k=j+1; k<n; k++){
                int idx=s.charAt(k)-'a';
                if(right[idx]==0)lenr++;
                right[idx]++;
                if(lenr<=26){
                    ans+=freq[lenr];
                }
            }
        }
        return ans;
    }
}