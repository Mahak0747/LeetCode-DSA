class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<10;i++){
            int val=i;
            int last=i+1;
            while(val<=high && last!=10){
                val=(val*10)+last;
                if(val>=low && val<=high) ans.add(val);
                last++;
            }
        }
        Collections.sort(ans);
        return ans;
    }
}