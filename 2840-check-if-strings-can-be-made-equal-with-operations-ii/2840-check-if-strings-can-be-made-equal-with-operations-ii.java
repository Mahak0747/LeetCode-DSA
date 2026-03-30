class Solution {
    public boolean checkStrings(String s1, String s2) {
        int[] even=new int[26];
        int[] odd=new int[26];
        for(int i=0; i<s1.length(); i++){
            if(i%2==0)even[s1.charAt(i)-'a']++;
            else odd[s1.charAt(i)-'a']++;
        }
        for(int i=0; i<s2.length(); i++){
            if(i%2==0){
                if(even[s2.charAt(i)-'a']<1)return false;
                else even[s2.charAt(i)-'a']--;
            }
            else{
                if(odd[s2.charAt(i)-'a']<1)return false;
                else odd[s2.charAt(i)-'a']--;
            }
        }
        return true;
    }
}