class Solution {
    public int maximumValue(String[] strs) {
        int max=Integer.MIN_VALUE;
        for(String s : strs){
            boolean isNumber = true;
            for(char ch : s.toCharArray()){
                if(!Character.isDigit(ch)){
                    isNumber = false;
                    break;
                }
            }
            if(isNumber){
                max = Math.max(max, Integer.parseInt(s));
            } else {
                max = Math.max(max, s.length());
            }
        }
        return max;
    }
}