class Solution {
    public int passwordStrength(String password) {
        int ans=0;
        String str="!@#$";
        HashSet<Character> set=new HashSet<>();
        for(char ch:password.toCharArray()){
            if(!set.contains(ch)){
                if(ch>='a'&& ch<='z')ans++;
                else if(ch>='A'&& ch<='Z')ans+=2;
                else if(ch>='0'&& ch<='9')ans+=3;
                else if(str.contains(ch+""))ans+=5;

                set.add(ch);
            }
        }
        return ans;
    }
}