import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        boolean[] merged = new boolean[n];
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (result.isEmpty() || intervals[i][0]>result.get(result.size()-1)[1]){
                result.add(intervals[i]);
            }
            else{
                result.get(result.size()-1)[1]=Math.max(result.get(result.size()-1)[1],intervals[i][1]);
            } 
        }

        return result.toArray(new int[result.size()][]);
    }
}
