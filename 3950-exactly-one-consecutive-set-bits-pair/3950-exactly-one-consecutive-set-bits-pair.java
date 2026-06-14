class Solution {
    public boolean consecutiveSetBits(int n) {
        String bs = Integer.toBinaryString(n);
        int c=0;
        for(int i=0; i<bs.length()-1; i++){
            if(bs.charAt(i)=='1'&&bs.charAt(i+1)=='1')c++;
        }
        return c==1;
    }
}