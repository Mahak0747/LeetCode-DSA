import java.util.Random;
class Solution {
    private static final Random rand = new Random();
    private static int partition(int[] arr, int low, int high) {
        int pivotIndex = low + rand.nextInt(high - low + 1);
        int temp = arr[low];
        arr[low] = arr[pivotIndex];
        arr[pivotIndex] = temp;

        int pivoit=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivoit && i<high){
                i++;
            }
            while(arr[j]>pivoit && j>0){
                j--;
            }
            if(i<j){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
    private static void quickSort(int[] arr, int low, int high) {
        if(low<high){
            int idx=partition(arr,low,high);
            quickSort(arr,low,idx-1);
            quickSort(arr,idx+1,high);
        }
    }
    public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }
}