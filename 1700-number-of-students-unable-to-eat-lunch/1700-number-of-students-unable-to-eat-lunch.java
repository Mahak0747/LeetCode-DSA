class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] arr=new int[2];
        for(int n:students)arr[n]++;
        for(int n:sandwiches){
            if(arr[n]==0)break;
            arr[n]--;
        }
        return arr[0]+arr[1];
    }
}