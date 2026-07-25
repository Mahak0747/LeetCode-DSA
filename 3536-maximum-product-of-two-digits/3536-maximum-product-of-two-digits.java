class Solution {
    public int maxProduct(int n) {
        if(n<10)return n;
        ArrayList<Integer> list=new ArrayList<>();
        int a=n;
        while(n>0){
            list.add(n%10);
            n/=10;
        }
        Collections.sort(list);
        return list.get(list.size()-1)*list.get(list.size()-2);
    }
}