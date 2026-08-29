class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n=nums.length;
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int groupNum = 0;
        HashMap<Integer, Integer> numToGroup = new HashMap<>();
        HashMap<Integer, LinkedList<Integer>> groupToList = new HashMap<>();
        numToGroup.put(arr[0], groupNum);
        groupToList.putIfAbsent(groupNum, new LinkedList<>());
        groupToList.get(groupNum).add(arr[0]);
        for (int i=1;i<n;i++) {
            if (Math.abs(arr[i]-arr[i-1])>limit) {
                groupNum++;
            }
            numToGroup.put(arr[i], groupNum);
            groupToList.putIfAbsent(groupNum, new LinkedList<>());
            groupToList.get(groupNum).add(arr[i]);
        }
        int[] result = new int[n];
        for (int i=0;i<n;i++) {
            int num=nums[i];
            int group=numToGroup.get(num);
            result[i]=groupToList.get(group).pollFirst();
        }
        return result;
    }
}