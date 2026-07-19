class Solution {
    public boolean canReach(int[] start, int[] target) {
        int[][] dir={{2,1},{2,-1},{-2,1},{-2,-1},
                    {2,1},{1,-2},{-1,2},{-1,-2}
                    };
        boolean[][] seen=new boolean[8][8];
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{start[0],start[1],0});
        seen[start[0]][start[1]]=true;
        while(!q.isEmpty()){
            int[] curr=q.remove();
            int x=curr[0];
            int y=curr[1];
            int d=curr[2];
            if(x==target[0] && y==target[1])return d%2==0;
            for(int[] i:dir){
                int newx=x+i[0];
                int newy=y+i[1];
                if(newx>=0 && newy>=0 && newx<8 && newy<8 && !seen[newx][newy]){
                    seen[newx][newy]=true;
                    q.add(new int[]{newx,newy,d+1});
                }
            }
        }
        return false;
    }
}