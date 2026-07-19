class Solution {
    public boolean[] transformStr(String s, String[] strs) {
        int n=s.length();
        int to=0;
        for(char ch:s.toCharArray())to+=ch-'0';
        int[] pre=new int[n+1];
        for(int i=0; i<n; i++){
            pre[i+1]=pre[i]+s.charAt(i)-'0';
        }
        boolean[] seen=new boolean[strs.length];
        for(int i=0; i<strs.length; i++){
            String t=strs[i];
            int o=0;
            int q=0;
            for(int j=0; j<n; j++){
                if(t.charAt(j)=='1')o++;
                else if(t.charAt(j)=='?')q++;
            }
            int need=to-o;
            if(need<0 || need>q){
                seen[i]=false;
                continue;
            }
            int po=0;
            int rem=need;
            int remq=q;
            boolean is=true;
            for (int j = 0; j < n; j++) {
                char ch = t.charAt(j);
                if(ch=='1')po++;
                else if(ch=='?'){
                    if(rem>remq-1){
                        po++;
                        rem--;
                    }
                    remq--;
                }
                if(po>pre[j+1]){
                    is=false;
                    break;
                }
            }
            seen[i]=is && rem==0;
        }
        return seen;
    }
}