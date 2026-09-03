public class DSU{
    int[] parent;
    public DSU(int n){
        parent=new int[n];
        for(int i=0; i<n; i++){
            parent[i]=i;
        }
    }
    public int findParent(int n){
        if(parent[n]==n)return n;
        parent[n]=findParent(parent[n]);
        return parent[n];
    }
    public void unionOfSets(int a,int b){
        int pa=findParent(a);
        int pb=findParent(b);
        if(pa==pb)return;
        parent[pb]=pa;
    }
}
class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        HashMap<String,Integer> map=new HashMap<>();
        DSU ds=new DSU(accounts.size());
        for(int i=0; i<accounts.size(); i++){
            for(int j=1; j<accounts.get(i).size(); j++){
                if(!map.containsKey(accounts.get(i).get(j)))map.put(accounts.get(i).get(j),i);
                else{
                    ds.unionOfSets(i,map.get(accounts.get(i).get(j)));
                }
            }
        }
        ArrayList<String>[] arr=new ArrayList[accounts.size()];
        for(int i=0; i<accounts.size(); i++){
            arr[i]=new ArrayList();
        }
        for(String k:map.keySet()){
            int idx=ds.findParent(map.get(k));
            arr[idx].add(k);
        }
        List<List<String>> ans=new ArrayList<>();
        for(int i=0; i<accounts.size(); i++){
            if(arr[i].size()==0)continue;
            Collections.sort(arr[i]);
            List<String> temp = new ArrayList<>();
            temp.add(accounts.get(i).get(0));
            temp.addAll(arr[i]);
            ans.add(temp);
        }
        return ans;
    }
}