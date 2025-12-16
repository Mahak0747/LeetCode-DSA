class Solution {
    public String lexSmallest(String s) {
        int n=s.length();
        String str=s;
        for(int i=0; i<s.length(); i++){
            StringBuilder sb = new StringBuilder(s.substring(0, i + 1));
            String rev=sb.reverse().toString();
            String ans=rev+s.substring(i+1);
            if (ans.compareTo(str) < 0)str = ans;

            sb = new StringBuilder(s.substring(i));
            rev=sb.reverse().toString();
            ans=s.substring(0,i)+rev;
            if (ans.compareTo(str) < 0)str = ans;
        }
        return str;
    }
}