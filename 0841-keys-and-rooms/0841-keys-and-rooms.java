class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] seen =new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int curr=q.remove();
            seen[curr]=true;
            for(int i:rooms.get(curr)){
                if(!seen[i])q.add(i);
            }
        }
        for(int i=0; i<n; i++){
            if(!seen[i])return false;
        }
        return true;
    }
}