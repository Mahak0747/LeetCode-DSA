class Solution {
    public boolean judgeCircle(String moves) {
        int r=0;
        int u=0;
        for(int i=0; i<moves.length(); i++){
            if(moves.charAt(i)=='R'){
                r++;
            }
            else if(moves.charAt(i)=='L'){
                r--;
            }
            else if(moves.charAt(i)=='U'){
                u++;
            }
            else if(moves.charAt(i)=='D'){
                u--;
            }
        }
        return r==0 && u==0;
    }
}