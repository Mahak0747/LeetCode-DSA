class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list=new ArrayList<>();
        long val=1;
        list.add((int)val);
        for(int i=1; i<=rowIndex; i++){
            val = val * (rowIndex - i + 1) / i;
            list.add((int)val);
        }
        return list;
    }
}