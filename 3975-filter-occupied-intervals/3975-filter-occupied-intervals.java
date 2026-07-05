class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] intervals, int freeStart, int freeEnd) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        ArrayList<ArrayList<Integer>> merged = new ArrayList<>();
        List<int[]> result = new ArrayList<>();
        for (int[] i:intervals) {
            if (result.isEmpty() || i[0]>result.get(result.size()-1)[1]+1)
                result.add(i);           
            else 
                result.get(result.size()-1)[1] =
    Math.max(result.get(result.size()-1)[1], i[1]);
        }
        List<List<Integer>> ans = new ArrayList<>();
        int start=freeStart;
        for(int[] i:result){
            if (i[1] < freeStart) ans.add(Arrays.asList(i[0], i[1]));
            else if (i[0] < freeStart) ans.add(Arrays.asList(i[0], freeStart - 1));
            
            if(i[0] > freeEnd) ans.add(Arrays.asList(i[0], i[1]));
            else if(i[1] > freeEnd) ans.add(Arrays.asList(freeEnd + 1, i[1]));
        }
        return ans;
    }
}