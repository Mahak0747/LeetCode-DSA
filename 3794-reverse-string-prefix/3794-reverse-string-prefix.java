class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb=new StringBuilder(s.substring(0,k)).reverse();
        String ans=sb.toString()+s.substring(k);
        return ans;
    }
}