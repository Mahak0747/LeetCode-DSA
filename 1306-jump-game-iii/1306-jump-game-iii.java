class Solution {
    public boolean canReach(int[] arr, int start) {
         boolean[] visited = new boolean[arr.length];
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int val=q.remove();
            if(arr[val]==0)return true;
            if(!visited[val]){
                if(val+arr[val]<arr.length)q.add(val+arr[val]);
                if(val-arr[val]>=0)q.add(val-arr[val]);
                visited[val] = true;
            }
        }
        return false;
    }
}