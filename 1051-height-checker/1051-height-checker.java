class Solution {
    public int heightChecker(int[] heights) {
        int[] arr=new int[heights.length];
        for(int i=0; i<arr.length; i++){
            arr[i]=heights[i];
        }
        Arrays.sort(heights);
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=heights[i]){
                j++;
            }
        }
        return j;
    }
}