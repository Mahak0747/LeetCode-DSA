class Solution {
    public int minDeletionSize(String[] strs) {
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        for(int i=1; i<strs.length; i++){
            for(int j=0; j<strs[i].length(); j++){
                String before=strs[i-1];
                String curr=strs[i];
                if(before.charAt(j)>curr.charAt(j) && !set.contains(j)){
                    set.add(j);
                    count++;
                }
            }
        }
        return count;
    }
}