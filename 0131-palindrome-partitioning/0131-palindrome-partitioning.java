class Solution {
    static List<List<String>> ans;
    private static boolean IP(String s, int l, int r){
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) {
                return false;
            }
        }
        return true;
    }
    private static void permutations(String str,int idx,ArrayList<String> list){
        if(idx==str.length()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx; i<str.length(); i++){
            if(IP(str,idx,i)){
                list.add(str.substring(idx,i+1));
                permutations(str,i+1,list);
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        ans=new ArrayList<>();
        permutations(s,0,new ArrayList<>());
        return ans;
    }
}