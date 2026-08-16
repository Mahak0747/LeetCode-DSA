class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int idx=-1;
        int ans=Integer.MAX_VALUE;
        for(int i=0; i<drones.length; i++){
            int x=drones[i][0];
            int y=drones[i][1];
            int r=drones[i][2];

            int distance = Math.abs(x - target[0])+ Math.abs(y - target[1]);
            if(distance<=r){
                if(distance<ans){
                    idx=i;
                    ans=distance;
                }
            }
        }
        return idx;
    }
}