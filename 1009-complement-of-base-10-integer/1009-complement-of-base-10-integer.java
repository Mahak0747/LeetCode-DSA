class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;  
        StringBuilder sb=new StringBuilder();
        while(n>0){
            char ch=(char)('0' + n % 2);
            ch = (ch == '0') ? '1' : '0'; 
            sb.insert(0, ch);
            n/=2;
        }
        String str=sb.toString();
        int ans=0;
        int mul=1;
        for(int i=str.length()-1; i>=0; i--){
            ans+=(str.charAt(i)-'0')*mul;
            mul*=2;
        }
        return ans;
    }
}