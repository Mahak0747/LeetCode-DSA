class Solution {
    public int maximumWidth(int[] planks) {
        HashMap<Long,Integer> map=new HashMap<>();
        for(int i: planks){
            map.put((long)i,map.getOrDefault((long)i,0)+1);
        }
        ArrayList<Long> list=new ArrayList<>(map.keySet());
        HashMap<Long,Integer> P=new HashMap<>();
        for(int i=0; i<list.size(); i++){
            long a=list.get(i);
            int frea=map.get(a);
            long sum=a+a;
            P.put(sum,P.getOrDefault(sum,0)+frea/2);
            for(int j=i+1; j<list.size(); j++){
                long b=list.get(j);
                int freb=map.get(b);
                long s=a+b;
                int g=Math.min(frea,freb);
                P.put(s,P.getOrDefault(s, 0)+g);
            }
        }
        long ans=1;
        for(Map.Entry<Long,Integer> e:map.entrySet()){
            long height=e.getKey();
            long width=e.getValue()+P.getOrDefault(height,0);
            ans=Math.max(ans,width);
        }
        for(int p:P.values())ans=Math.max(ans,p);
        return (int)ans;
    }
}