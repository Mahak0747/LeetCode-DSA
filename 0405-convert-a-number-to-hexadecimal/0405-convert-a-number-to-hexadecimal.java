class Solution {
    public String toHex(int num) {
        if(num==0){
            return "0";
        }
        long val=num;
        if(num<0){
            val = (long)(Math.pow(2,32)) + num;
        }
        StringBuilder s = new StringBuilder();
        String hexCode="0123456789abcdef";
        while(val>0){
            int rem=(int)(val%16);
            s.append(hexCode.charAt(rem));
            val/=16;
        }
        return s.reverse().toString();
    }
}