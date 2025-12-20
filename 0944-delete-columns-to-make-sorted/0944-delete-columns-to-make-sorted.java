class Solution {
    public int minDeletionSize(String[] strs) {
        // HashSet<Integer> set=new HashSet<>();
        int count=0;
        // for(int i=1; i<strs.length; i++){
        //     for(int j=0; j<strs[i].length(); j++){
        //         String before=strs[i-1];
        //         String curr=strs[i];
        //         if(before.charAt(j)>curr.charAt(j) && !set.contains(j)){
        //             set.add(j);
        //             count++;
        //         }
        //     }
        // }
        for(int i=0; i<strs[0].length(); i++){
            for(int j=1; j<strs.length; j++){
                if(strs[j].charAt(i)<strs[j-1].charAt(i)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}