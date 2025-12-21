class Solution {
     public void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=-1;
        for(int i=0; i<n; i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return;
        }
        for(int i=j+1; i<n; i++){
            if(nums[i]!=0){
                int t=nums[j];
                nums[j]=nums[i];
                nums[i]=t;
                j++;
            }
        }







        // int snowBallSize = 0; 
        // for (int i=0;i<nums.length;i++){
	    //     if (nums[i]==0){
        //         snowBallSize++; 
        //     }
        //     else if (snowBallSize > 0) {
	    //         int t = nums[i];
	    //         nums[i]=0;
	    //         nums[i-snowBallSize]=t;
        //     }
        // }
    }
}