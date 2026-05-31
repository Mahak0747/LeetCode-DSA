class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        boolean can=true;
        long cmass=mass;
        for(int i=0; i<asteroids.length; i++){
            if(cmass<asteroids[i]){
                return false;
            }
            cmass+=asteroids[i];
        }
        return true;
    }
}