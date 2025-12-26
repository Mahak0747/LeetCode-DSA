class Solution {
    public String[] getFolderNames(String[] names) {
        HashMap<String,Integer> map=new HashMap<>();
        String ans[]=new String[names.length];
        int idx=0;

        for(String n:names){
            if(!map.containsKey(n)){
                map.put(n,map.getOrDefault(n,0)+1);
                ans[idx++]=n;
            }else{
                int i=map.get(n);
                String s=n+"("+i+")";
                while(map.containsKey(s)){
                    i++;s=n+"("+i+")";
                }
                ans[idx++]=s;
                map.put(n,map.get(n)+1);
                map.put(s,map.getOrDefault(s,0)+1);

            }
        }return ans;
    }
}