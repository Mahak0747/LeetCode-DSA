class Solution {
    public int maxDistance(String moves) {
        int x=0;
        int y=0;
        int blank=0;
        for(char ch:moves.toCharArray()){
            if (ch == 'R') x++;
            else if (ch == 'L') x--;
            else if (ch == 'U') y++;
            else if (ch == 'D') y--;
            else blank++;
        }
        return Math.abs(x) + Math.abs(y) + blank;
    }
}