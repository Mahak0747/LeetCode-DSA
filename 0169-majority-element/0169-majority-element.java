class Solution {
    public int majorityElement(int[] nums) {
        int el=0;
        int count=0;
        for(int i: nums){
            if(count==0){
                el=i;
                count=1;
            }
            else if(i==el){
                count++;
            }
            else{
                count--;
            }
        }
        return el;
    }
}