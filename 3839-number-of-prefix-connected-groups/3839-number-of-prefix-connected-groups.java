class Solution {
    public int prefixConnected(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0; i<words.length; i++){
            String str=words[i];
            if(str.length()>=k){
                String ss=str.substring(0,k);
                map.put(ss,map.getOrDefault(ss,0)+1);
            }
        }
        int c=0;
        for(int st:map.values()){
            if(st>1)c++;
        }
        return c;
    }
}