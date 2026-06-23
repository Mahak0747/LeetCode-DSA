class Solution {
    public int numberOfSubstrings(String s) {
        int[] arr=new int[3];
        Arrays.fill(arr,-1);
        int sum=0;
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']=i;
            if(arr[0]!=-1 && arr[1]!=-1 && arr[2]!=-1){
                int min=Math.min(arr[0],Math.min(arr[1],arr[2]));
                sum+=min+1;
            }
        }
        return sum;
    }
}