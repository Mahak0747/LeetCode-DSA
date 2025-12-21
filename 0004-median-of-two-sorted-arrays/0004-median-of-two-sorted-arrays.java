class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int n=n1+n2;
        int idx2=n/2;
        int idx1=idx2-1;
        int el1=-1;
        int el2=-1;
        int i=0;
        int j=0;
        int count=0;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                if(count==idx1)el1=nums1[i];
                if(count==idx2)el2=nums1[i];
                count++;
                i++;
            }
            else{
                if(count==idx1)el1=nums2[j];
                if(count==idx2)el2=nums2[j];
                count++;
                j++;
            }
        }
        while(i<n1){
            if(count==idx1)el1=nums1[i];
            if(count==idx2)el2=nums1[i];
            count++;
            i++;
        }
        while(j<n2){
            if(count==idx1)el1=nums2[j];
            if(count==idx2)el2=nums2[j];
            count++;
            j++;
        }
        if(n%2==0)return (el1+el2)/2.0;
        return el2/1.0;
    }
}