class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        while(start <= end){
            int mid = start + (end - start) / 2;
            long sq = (long) mid*mid;
            if(sq == num){
                return true;
            }
            else if(sq < num){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }
}