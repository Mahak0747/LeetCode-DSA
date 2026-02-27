class Solution {
    public int findDuplicate(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i]))return arr[i];
            set.add(arr[i]);
        }
        return -1;
    }
}