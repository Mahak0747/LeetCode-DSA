class Solution {
    public int residuePrefixes(String s) {
        boolean[] arr=new boolean[26];
        int ans=0;
        int dis=0;
        for(int i=0; i<s.length(); i++){
            int idx=s.charAt(i)-'a';
            if(!arr[idx]){
                arr[idx]=true;
                dis++;
            }
            if (dis == (i + 1) % 3)ans++;
        }
        return ans;
    }
}