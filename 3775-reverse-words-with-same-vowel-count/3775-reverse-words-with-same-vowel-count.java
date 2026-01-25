class Solution {
    private int vowelCount(String str){
        int count = 0;
        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        if(arr.length==1)return s;
        int first=vowelCount(arr[0]);
        StringBuilder sb=new StringBuilder();
        sb.append(arr[0]);
        for(int i=1;i<arr.length; i++){
            sb.append(" ");
            if(vowelCount(arr[i])==first)sb.append(new StringBuilder(arr[i]).reverse());
            else sb.append(arr[i]);
        }
        return sb.toString();
    }
}