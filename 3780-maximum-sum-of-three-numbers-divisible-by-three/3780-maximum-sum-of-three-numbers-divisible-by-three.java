class Solution {
    public int maximumSum(int[] nums) {
        int sum=0; 
        ArrayList<Integer> rem0=new ArrayList<>();
        ArrayList<Integer> rem1=new ArrayList<>();
        ArrayList<Integer> rem2=new ArrayList<>();
        for(int n: nums){
            sum+=n;
            if(n%3==1)rem1.add(n);
            else if(n%3==0)rem0.add(n);
            else rem2.add(n);
        }
        Collections.sort(rem0,Collections.reverseOrder());
        Collections.sort(rem1,Collections.reverseOrder());
        Collections.sort(rem2,Collections.reverseOrder());
        int max=0;
        if(rem0.size()>=3)max=Math.max(max,rem0.get(0)+rem0.get(1)+rem0.get(2));
        if(rem1.size()>=3)max=Math.max(max,rem1.get(0)+rem1.get(1)+rem1.get(2));
        if(rem2.size()>=3)max=Math.max(max,rem2.get(0)+rem2.get(1)+rem2.get(2));
        if(rem2.size()>=1 && rem0.size()>=1 && rem1.size()>=1){
            max=Math.max(max,rem1.get(0)+rem2.get(0)+rem0.get(0));
        }
        return max;
    }
}