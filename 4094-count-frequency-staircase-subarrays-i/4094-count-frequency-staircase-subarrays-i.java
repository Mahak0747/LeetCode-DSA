class Solution {
    public int countStaircase(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0; i<n; i++){
            ArrayList<Integer> l=new ArrayList<>();
            HashMap<Integer,Integer> map=new HashMap<>();
            HashMap<Integer,Integer> range=new HashMap<>();
            int c=0;
            for(int j=i; j<n; j++){
                int val=nums[j];
                if(!map.containsKey(val)){
                    int idx=l.size();
                    l.add(val);
                    map.put(val,1);
                    range.put(val,idx);
                    if(1==idx+1)c++;
                }
                else{
                    int idx=range.get(val);
                    int fre=map.get(val);
                    if(fre==idx+1)c--;
                    int nf=fre+1;
                    map.put(val,nf);
                    if(nf==idx+1)c++;
                }
                if(c==l.size())ans++;
            }
        }
        return ans;
    }
}