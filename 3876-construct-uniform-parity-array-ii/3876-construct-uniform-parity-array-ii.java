class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;
        for(int n:nums1){
            min=Math.min(min,n);
            if(n%2==1)minOdd=Math.min(minOdd,n);
        }
        if(minOdd==Integer.MAX_VALUE)return true;
        for(int n:nums1)
            if(n%2==0 &&n<=minOdd)return false;
        return true;
    }
}