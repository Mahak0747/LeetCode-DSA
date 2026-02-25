class Solution {
    public int[] sortByBits(int[] arr) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int val=Integer.bitCount(arr[i]);
            min=Math.min(min,val);
            max=Math.max(max,val);
            map.putIfAbsent(val, new ArrayList<>());
            map.get(val).add(arr[i]);
        }
        int index = 0;
        for(int i=min; i<=max; i++){
            if(map.containsKey(i)){
                ArrayList<Integer> list = map.get(i);
                Collections.sort(list);
                for (int num : list) {
                    arr[index++] = num;
                }
            }
        }
        return arr;
    }
}