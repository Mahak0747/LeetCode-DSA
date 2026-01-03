class Solution {
    public int minLength(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int l=0;
        int ans=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            int val=arr[i];
            map.put(val,map.getOrDefault(val,0)+1);
            if(map.get(val)==1)sum+=val;
            while(sum>=k){
                ans=Math.min(ans,i-l+1);
                int leftval=arr[l];
                map.put(leftval,map.get(leftval) - 1);
                if(map.get(leftval)==0){
                    sum-=leftval;
                }
                l++;
            }
        }
        return ans==Integer.MAX_VALUE? -1:ans;
    }
}