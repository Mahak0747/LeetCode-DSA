class Solution {
    public boolean checkValidString(String s) {
        int o=0;
        int c=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                o++;
                c++;
            }
            else if(ch==')'){
                c--;
                o--;
            }
            else{
                o++;
                c--;
            }
            if(o<0)return false;
            if(c<0)c=0;
        }
        return c==0;
    }
}