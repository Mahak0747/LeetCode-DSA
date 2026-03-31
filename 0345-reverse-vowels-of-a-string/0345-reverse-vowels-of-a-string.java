class Solution {
    public String reverseVowels(String s) {
        String vowels="aeiouAEIOU";
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(vowels.indexOf(ch)!=-1)sb.append(ch);
        }
        StringBuilder newsb=new StringBuilder(sb.reverse().toString());
        int i=0;
        StringBuilder ans=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(vowels.indexOf(ch)!=-1){
                ans.append(newsb.charAt(i));
                i++;
            }
            else ans.append(ch);
        }
        return ans.toString();
    }
}