class Solution {
    private static boolean check (String str){
        int l=0;
        int r=str.length()-1;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean isPalindromic(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            int val=ch;
            String binary = Integer.toBinaryString(val);
            while(binary.length()<8){
                binary="0"+binary;
            }
            sb.append(binary);
        }
        return check(sb.toString());
    }
}