class Solution {
    public String maximumXor(String s, String t) {
        int n=s.length();
        int one=0;
        for(char c:t.toCharArray())if(c=='1')one++;
        int zero=n-one;
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='0'){
                if(one>0){
                    sb.append('1');
                    one--;
                }
                else{
                    sb.append('0');
                    zero--;
                }
            }
            else{
                if(zero>0){
                    sb.append('1');
                    zero--;
                }
                else{
                    sb.append('0');
                    one--;
                }
            }
        }
        return sb.toString();
    }
}